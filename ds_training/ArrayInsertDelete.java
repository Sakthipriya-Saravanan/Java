import java.util.Scanner;
import java.util.Arrays;

public class ArrayInsertDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1]; 
      
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
      
        System.out.println("Original Array: " + Arrays.toString(Arrays.copyOf(arr, n)));

        System.out.print("Enter the element to insert: ");
        int insertElement = scanner.nextInt();
        System.out.print("Enter the position (0-based index): ");
        int insertPos = scanner.nextInt();

        if (insertPos < 0 || insertPos > n) {
            System.out.println("Invalid position!");
        } else {
            
            for (int i = n; i > insertPos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[insertPos] = insertElement;
            n++; 
            System.out.println("Array after insertion: " + Arrays.toString(Arrays.copyOf(arr, n)));
        }

       
        System.out.print("Enter the position to delete (0-based index): ");
        int deletePos = scanner.nextInt();

        if (deletePos < 0 || deletePos >= n) {
            System.out.println("Invalid position!");
        } else {
           
            for (int i = deletePos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr, n)));
        }

        scanner.close();
    }
}
