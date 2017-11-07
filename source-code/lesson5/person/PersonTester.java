
/**
 * Write a description of class PersonTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonTester
{
    Person p1;
    Person p2;
    public PersonTester(double h1, double h2){
        p1=new Person(h1);
        p2=new Person(h2);
    }

    public void sampleMethod()
    {
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
    }
}
