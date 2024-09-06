

interface vechicle{
    void start ();
}
interface feature{
    void gps ();
}
class car implements vechicle,feature{
      public  void start (){ //override=
         System.out.println("car started");
     }
     public void gps(){
         System.out.println("Gps using navigation");
     }
}
public class overriding {
    public static void main(String[] args) {
        car c=new car();
        c.start();
        c.gps();

    }
}
