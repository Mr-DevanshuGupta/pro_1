import java.util.*;

public class hacker1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean dev = true;
        int mid;
        if (A.length() % 2 == 0) {
            mid = A.length() / 2;
        } else {
            mid = (A.length() - 1) / 2;
        }
        int k = A.length();
        System.out.println(k + mid);
        for (int i = 0; i < mid; i++) {
            if (A.substring(i) != A.substring(k - i - 1)) {
                dev = false;
                break;
            }
        }
        if (dev == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */

    }

}
