import java.math.*;
public class Refillable
{
    int score;
    double timesUsed;
    double totalUsed;
    
    public Refillable(int c)
    {
        score=Math.abs(c);
    }
    
    public boolean decrement(int removed){
        if(score-removed>=0){
            score-=removed;
            totalUsed+= removed;
            timesUsed+=1;
            System.out.println("Score decreased by "+removed);
            return true;
        }
        return false;
    }
    
    public boolean increment(int added){
        if(score+added>=0){
            score+=added;
            System.out.println("Score increased by "+ added);
            return true;
        }
        return false;
    }

    public int getScore(){return score;}
    public double averageUse(){return totalUsed/timesUsed;}
}
