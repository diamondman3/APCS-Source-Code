import java.util.*;

public class AlarmClock
{
    
    Scanner scan=new Scanner(System.in);
    
    public AlarmClock(){
            int[] delayTime= new int[3];
            delayTime=makeDelay();  
            delayAndCountTime(delayTime[0], delayTime[1], delayTime[2]);
    }
    
    public int[] makeDelay(){
        
        int[] totalTime= new int[3];
        
        System.out.println("Input hours");
        int hours=scan.nextInt();
        System.out.println("Input minutes");
        int minutes=scan.nextInt();
        System.out.println("Input seconds");
        int seconds=scan.nextInt();
        //make seconds less than 1 minute total
        while(seconds>=60){
            seconds=seconds-60;
            minutes+=1;
        }
        //make minutes less than 1 hour total
        while(minutes>=60){
            minutes=minutes-60;
            hours+=1;
        }
        return new int[]{hours, minutes, seconds};
    }
    
    public void delayAndCountTime(int hours, int minutes, int seconds){
        //If the smallest unit is 0, convert the next smallest to that. Do recursively unless hours
        //==0, then ring.
        while(seconds>0||minutes>0||hours>0){
            if(seconds==0){
                if(minutes==0){
                        hours=hours-1;
                        minutes=59;
            }
                else{
                    minutes=minutes-1;
                    seconds=59;
                }
            }
            else{
                seconds=seconds-1;
            }
            System.out.println(hours+":"+minutes+":"+seconds);
            try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
        }
        ring();
    }
    
    public void ring(){System.out.println("Beep beep beep beep!");}
    
}
