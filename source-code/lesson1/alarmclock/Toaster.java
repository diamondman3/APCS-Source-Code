public class Toaster extends AlarmClock
{
    int temperature;
    boolean hasBread=false;
    public Toaster()
    {
        super();
    }
    //add a Bread function
    public int[] makeDelay(){super.makeDelay()};
    public void delayAndCountTime(int hours, int minutes, int seconds, int temp){super.delayAndCountTime();}
    public void ring(){//make modifications to message based on bread, temp, time
        System.out.println("Your toast is done.");
        
    public void makeTemp(){System.out.println("Input temperature (Fahrenheit)");
        return scan.nextInt();
    }    
}
