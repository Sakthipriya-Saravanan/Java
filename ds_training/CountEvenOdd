import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int evenCount = 0, oddCount = 0;

        System.out.println("enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
        scanner.close();
    }
}
