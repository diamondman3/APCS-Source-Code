import java.math.*;
public class MyCandyJar
{

    int candyNum;
    
    public MyCandyJar()
    {
        candyNum=10;
    }
    
    public MyCandyJar(int c)
    {
        candyNum=Math.abs(c);
    }
    
    public boolean eat(int candyEaten){
        if(candyNum-candyEaten>=0){
            candyNum-=candyEaten;
            return true;
        }
        return false;
    }
    
    public boolean refill(int candyEaten){
        if(candyNum+candyEaten>=0){
            candyNum+=candyEaten;
            return true;
        }
        return false;
    }
}
