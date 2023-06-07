import java.util.*;

public class primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        // int end = sc.nextInt();
        // for (int i = start; i <= end; i++) {
        // if (isPrime(i)) {
        // System.out.println(i);
        // }
        // }

        int res = 0;
        while (start  != 0) {
            res = res * 10 + (start % 10);
            start /= 10;
        }

        System.out.println(res);

    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;

            }

        }

        return true;
    }
}
