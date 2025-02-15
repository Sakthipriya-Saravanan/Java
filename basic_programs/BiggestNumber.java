import java.util.Scanner;

public class BiggestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter a number1:");
         int number1 = sc.nextInt();

         System.out.println("Enter a number2:");
         int number2 = sc.nextInt();

         System.out.println("Enter a number3:");
         int number3 = sc.nextInt();

         int biggest;

         if(number1>number2 && number1>number3 ){
             biggest = number1;
         }
         else if(number2>number1 && number2>number3 ){
             biggest = number2;
         }
         else{
             biggest = number3;
         }
         System.out.println("The biggest Number is " +biggest);
         sc.close();
    }
}
