import java.util.*;

public class suceedingorder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements of an array: ");
        boolean six = false;
        boolean seven = false;

        int six_id = -1;
        int seven_id = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 6) {
                six = true;
                six_id = i;
            }
            if (arr[i] == 7 && six) {
                seven = true;
                seven_id = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (six && seven) {
                if (i < six_id || i > seven_id) {
                    sum += arr[i];
                }
            } else {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }

}
