abstract class bike{
    abstract void run();
}
class Honda4 extends bike{
    void run(){
        System.out.println("RUNNING SAFETY");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        bike obj = new Honda4();
        obj.run();
    }
}
