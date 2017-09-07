public class Student
{
    String eyeColor;
    //Would have used int[], but not in requirements
    double height;
    //in inches
    boolean isMale;
    int gradeLevel;
    
    public Student()
    {
        eyeColor="blue";
        height=54.6;
        isMale=false;
        gradeLevel=9;
    }
    
    public Student(String i, double h, boolean m, int g){
        eyeColor=i;
        height=h;
        isMale=m;
        gradeLevel=g;
    }
    
    public double getHeight(){return height;}
    public void setHeight(double h){height=h;}
    
    public void read(){System.out.println("reading");}
    public void write(){System.out.println("writing");}
    public void talk(){System.out.println("talking");}
    public String getDistracted(){
        System.out.println("getting distracted"); 
        return "Max! Get back to work!";
    }
}
