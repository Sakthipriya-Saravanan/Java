import java.util.Scanner;

public class ProductMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int max1 = arr1[0];
        for (int i = 1; i < n1; i++) {
            if (arr1[i] > max1) {
                max1 = arr1[i];
            }
        }

        int min2 = arr2[0];
        for (int i = 1; i < n2; i++) {
            if (arr2[i] < min2) {
                min2 = arr2[i];
            }
        }
      
        int product = max1 * min2;
      
        System.out.println("Product of max(first array) and min(second array): " + product);

        scanner.close();
    }
}
