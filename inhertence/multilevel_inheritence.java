package calculator;


class DepartmentStore { 
	
    //String PuffTypes="Egg,Veg,Mushroom,Chicken,Panneer";
    String PuffTypes;
    void Puff() {
        this.PuffTypes="Egg,Veg,Mushroom,Chicken,Panneer";
        System.out.println("DepartmentStore is Selling Puffs");
        System.out.println("PuffTypes: "+PuffTypes);
    }  
}  
class Sakthi extends DepartmentStore { 
   
    int PuffRate;
    void Buys() {
        this.PuffRate=20;
        System.out.println("Sakthi buys egg puff");
        System.out.println("PuffRate: "+PuffRate);
    }  
    /*void Another(){
        super.Puff();
    }
    */
}  
class Tharun extends Sakthi{  
    void Thief() {
        System.out.println("Tharun stole the egg puff from Sakthi");
    }  
}  
public class multilevel{  
    public static void main(String args[]){  
        Tharun t=new Tharun();  
        t.Puff();  
        t.Buys();  
        t.Thief();
        //t.Another();
    }  
}
