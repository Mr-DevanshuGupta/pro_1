import java.util.*;

public class array1 {
    public static void main(String args[]) {
        int[] a = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search in array: ");
        int tar = sc.nextInt();

        boolean res = false;
        int sum = 0;

        Arrays.sort(a);
        int i;
        for (i = 0; i < a.length; i++) {
            if (tar == a[i]) {
                res = true;
                break;
            }
        }

        if (res == true) {
            System.out.println("The item is fonud at " + i);
        } else {
            System.out.println(-1);
        }

        for (i = 0; i < a.length; i++) {
            sum += a[i];

        }
        System.out.println("The sum of given array is" + sum);
        System.out.println("The average of given array is" + sum / a.length);
        System.out.println("The max of given array is " + a[a.length - 1] + " and min is " + a[0]);

    }
}
