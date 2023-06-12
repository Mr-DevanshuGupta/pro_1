import java.util.*;

public class evenodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of an array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int arr1[] = new int[n];
        int start = 0;
        int last = n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr1[start] = arr[i];
                start++;
            } else {
                arr1[last] = arr[i];
                last--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
