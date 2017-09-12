public class CellPhone
{
    public String password;
    public int phoneNumber;
    public double batteryCharge;
    public boolean isOn;
    
    public CellPhone()
    {
        password="correcthorsebatterystaple";
        phoneNumber=5550155;
        batteryCharge=100.00D;
        isOn=false;
    }
    
    public CellPhone(String pass, int number){
        password=pass;
        phoneNumber=number;
        //SOMEHOW there's an error when I pass in number.
    }
}
