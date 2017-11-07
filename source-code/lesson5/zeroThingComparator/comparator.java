
public class comparator
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int z;
    
    public comparator(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public boolean twoAreZero()
    {
        return((x==0&&y==0&&z!=0)||(x==0&&y!=0&&z==0)||(x!=0&&y==0&&z==0));
    }
}
