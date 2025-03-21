import java.util.Scanner;

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
      
        n = removeDuplicates(arr, n);
      
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    private static int removeDuplicates(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--; 
                    j--;
                }
            }
        }
        return n; 
    }
}
