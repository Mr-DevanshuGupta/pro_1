public class Array {
    public static void main(String args[]) {
        int[] a = { 1, 2, 3, 4, 5 };
        int result = 1;
        for (int i : a) {
            result *= i;
        }
        System.out.println(result);
    }
}
