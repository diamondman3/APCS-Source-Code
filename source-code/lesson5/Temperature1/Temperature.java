// UNUSED right now


 public class Temperature{
 
    public String tempStr;
    
    public Temperature(){
    }

    public void tempRead1(int temp){
 
        if (temp >= 65 && temp <= 75) {
            tempStr = "comfortable";
        } else {
            tempStr = "uncomfortable";
        }
    }
 
    public void tempRead2(int temp){
        if (temp >= 65 || temp <= 75) {
            tempStr = "comfortable";
        } else {
            tempStr = "uncomfortable";
        }
    }
    
    public void tempRead3(int temp){
       if (temp < 40) {
          tempStr = "cold";
       } else if (temp < 60) {
          tempStr = "cool";
       } else if (temp < 80) {
          tempStr = "warm";
       } else{
          tempStr = "hot";
       }
       System.out.println(tempStr);
     }
}
