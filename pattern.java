public class pattern {
    public static void main(String args[]) {
        int n = 5;
        // * * * *
        // * *
        // * *
        // * * * *

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {

        // System.out.print("*" + " ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // *
        // **
        // ***
        // ****

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 1
        // 12
        // 123
        // 1234

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(j + 1);
        // }
        // System.out.println();
        // }

        // 12345
        // 1234
        // 123
        // 12
        // 1

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= n - i - 1; j++) {
        // System.out.print(j + 1);
        // }
        // System.out.println();
        // }

    }
}