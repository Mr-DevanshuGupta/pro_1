public class towerOfHanoi {
    public static void main(String args[]) {
        int n = 1;
        towe(n, "so", "he", "de");

    }

    public static void towe(int n, String source, String helper, String dest) {
        if (n == 1) {

            System.out.println("Transefering disk " + n + " from " + source + " to " + dest);
            return;
        }

        towe(n - 1, source, dest, helper);
        System.out.println("Transfering disk" + n + " from " + source + " to " + dest);
        towe(n - 1, helper, source, dest);
    }
}
