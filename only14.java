import java.util.*;

public class only14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of an array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        boolean check = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 1) {
                if (arr[i] != 4) {
                    check = false;
                    break;
                }
            }
        }
        System.out.println(check);
    }
}
