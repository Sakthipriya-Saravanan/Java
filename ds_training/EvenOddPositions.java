import java.util.Scanner;

public class EvenOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
      
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sumEvenPos = 0, sumOddPos = 0;
      
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEvenPos += arr[i]; 
            } else {
                sumOddPos += arr[i];  
            }
        }
      
        System.out.println("Sum of elements at even positions: " + sumEvenPos);
        System.out.println("Sum of elements at odd positions: " + sumOddPos);

        scanner.close();
    }
}
