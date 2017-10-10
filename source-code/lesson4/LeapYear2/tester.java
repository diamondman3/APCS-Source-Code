
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tester
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class tester
     */
    public tester()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        LeapYear l1 = new LeapYear(1);
        LeapYear l2 = new LeapYear(1000);
        LeapYear l3 = new LeapYear(2000);
        LeapYear l4 = new LeapYear(256);
        l1.setLeapYear();
        l2.setLeapYear();
        l3.setLeapYear();
        l4.setLeapYear();
    }
}
