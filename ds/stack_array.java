import java.util.*;
public class Stack{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int []Stack=new int[n];
        int top=-1; 
        while(true) {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
             System.out.println("Enter 3 to peek");
              System.out.println("Enter 4 to Display ");
              System.out.println("Enter 5 to Exit");
              
              int choice=a.nextInt();
              switch(choice){
              case 1:
                  System.out.print("PUSH");
                  if(top==n-1){
                      System.out.print("Stack is Overflow");
                  }
                  else{
                      System.out.print("Enter Element to Push");
                      int x=a.nextInt();
                      top++;
                      Stack[top]=x;
                  }
                  break;
              case 2:
                  System.out.print("pop");
                  if(top==-1){
                      System.out.print("Stack Underflow");
                  }
                  else{
                  }
                      System.out.print("Popped Element:"+Stack[top]);
                      top--;
                  
                  break;
              case 3:
              System.out.println("Peek Element:"+Stack[top]);
              break;
              
              case 4:
              System.out.print("Displaying Stack Element");
              for(int i=top;i>=0;i--) {
                  System.out.print(Stack[i]);
              }
              break;
              
              case 5:
              System.out.println("EXIT");
            
                  
          default:
          System.out.print("invalid choice");
                  
              }
        }
    }
}
