import java.util.*;

public class exception1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <= n; i++) {
            try {
                arr[i] = sc.nextInt();
                arr[i] /= 0;
            } catch (ArithmeticException e) {
                System.out.println("Zero se divide nahi hota");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("size ke anusar element enter kar");
            }
        }

    }

}
