import java.util.Scanner;

public class copy_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
      
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }
    
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }     
      
        System.out.print("Elements of second array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        scanner.close();
    }
}
