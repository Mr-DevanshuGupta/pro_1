public class ascii {
    public static void main(String args[]) {
        int arr[] = { 173, 65, 111, 70, 11, 10 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print((char) arr[i] + " ");
        }

        int min1 = arr[0];
        int min2 = arr[1];

        int max1 = arr[0];
        int max2 = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }

        System.out.println("Max1 = " + max1 + " Max2 = " + max2);
        System.out.println("Min1 = " + min1 + " Min2 = " + min2);
    }
}
