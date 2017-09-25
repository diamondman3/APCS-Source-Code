public class lockers
{
    int totalLockers;
    public lockers(int total){
        totalLockers=total;
    }
    
    public boolean[] doProcedure(){
        boolean[] lockerArray= new boolean[totalLockers];
        int pointer = 0;
        for(int i = 1; i<=totalLockers; i++){
            while (pointer<totalLockers){
                lockerArray[pointer]=!lockerArray[pointer];
                pointer=pointer+i;
            }
            pointer=0;
        }
        for(int i=0; i<totalLockers; i++){
            if(!lockerArray[i]){
                System.out.print("0");
            }
            else{
                System.out.print("1");
            }
        }
        System.out.println("\nUsing "+totalLockers+ " bits.");
        return lockerArray;
    }
}
