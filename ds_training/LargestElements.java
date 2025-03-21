import java.util.Scanner;
import java.util.Arrays;

public class LargestElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }


        Arrays.sort(arr);

        System.out.println("First largest element: " + arr[size - 1]);
        System.out.println("Second largest element: " +arr[size - 2]);

        scanner.close();
    }
}
