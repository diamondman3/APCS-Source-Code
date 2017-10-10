
public class Exchange
{
    int x;
    int y;

    public Exchange(int a, int b)
    {
        x=a;
        y=b;
        System.out.println(x+ "  " +y);
        exchange();
        System.out.println(x+ "  " +y);
    }
    
    
    public void exchange()
    {
       int temp;
       temp=x;
       x=y; 
       y=temp;
    }
}
