
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private double height;
    /**
     * Constructor for objects of class Person
     */
    public Person(double height)
    {
        this.height=height;
    }
    public boolean equals(Person p)
    {
        return p.getHeight()==this.height;
    }
    public double getHeight(){return this.height;}
}
