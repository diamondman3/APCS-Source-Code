public class StringTest
{

private String s="Corn Chips";
private String stringLeft;
private String stringRight;
    public StringTest()
    {
        stringLeft=s.substring(0, s.indexOf(" "));
        stringRight=s.substring(s.indexOf(" ")+1);
        
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        s="   "+s+ "  ";
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s.trim().substring(s.trim().length()-2));
    }
}
