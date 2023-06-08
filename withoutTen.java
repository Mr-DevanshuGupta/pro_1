import java.util.*;

public class withoutTen {
    public static void main(String args[]) {
        int arr[];
        System.out.println("Enter the size of te array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        int count = 0;
        int count_1 = 0;
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            if (b == 10) {
                count++;
            } else {
                arr[count_1] = b;
                count_1++;
            }
        }
        for (int j = 0; j < count; j++) {
            arr[count_1] = 0;
        }

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }

    }
}
