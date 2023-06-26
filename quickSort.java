public class quickSort {
    public static void main(String args[]) {
        int arr[] = { 12, 32, 2, 12, 63, 6, 34, 76 };

        quick(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        print(arr);
    }

    static void quick(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quick(arr, low, pi - 1);
            quick(arr, pi + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);
            }
        }
        swap(arr, i + 1, high);

        return i + 1;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
