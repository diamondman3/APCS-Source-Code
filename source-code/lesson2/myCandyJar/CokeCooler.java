import java.math.*;
public class CokeCooler
{

    int sodaNum;

    public CokeCooler(int c)
    {
        sodaNum=Math.abs(c);
    }
    
    public boolean drink(int sodasDrunk){
        if(sodaNum-sodasDrunk>=0){
            sodaNum-=sodasDrunk;
            System.out.println(sodasDrunk + " Cokes removed.");
            return true;
        }
        return false;
    }
    
    public boolean refill(int sodasAdded){
        if(sodaNum+sodasAdded>=0){
            sodaNum+=sodasAdded;
            System.out.println(sodasAdded + " Cokes added.");
            return true;
        }
        return false;
    }

    public int getSodaNum(){return sodaNum;}
}
