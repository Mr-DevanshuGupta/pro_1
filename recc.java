public class recc {
    public static void main(String args[]) {
        // printNumb(5);
        sum(1, 7, 0);

        int fac = fact(5);
        System.out.println(fac);

        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fib(a, b, n - 2);

        int d = calcPow(2, 5);
        System.out.println(d);

    }

    public static void printNumb(int n) {

        if (n == 0) {
            return;
        }
        printNumb(n - 1);
        System.out.println(n);
    }

    public static void sum(int i, int n, int sum) {
        if (i == n) {
            sum += n;
            System.out.println(sum);
            return;
        }

        sum += i;
        sum(i + 1, n, sum);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void fib(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.println(c);
        fib(b, c, n - 1);

    }

    public static int calcPow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calcPow(x, n / 2) * calcPow(x, n / 2);
        } else {
            return calcPow(x, n / 2) * calcPow(x, n / 2) * x;
        }
    }
}
