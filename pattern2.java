public class pattern2 {

    public static void main(String args[]) {

        int n = 4;

        // * *
        // ** **
        // *** ***
        // ********
        // ********
        // *** ***
        // ** **
        // * *

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (n - i - 1);
        // for (int j = 0; j <spaces; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = n - 1; i >= 0; i--) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (n - i - 1);
        // for (int j = 0; j < spaces; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
