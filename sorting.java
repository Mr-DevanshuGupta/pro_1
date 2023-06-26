import java.util.Scanner;
import java.util.*;

public class sorting {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int arr[] = { 7, 8, 3, 1, 2 };

        // for (int i = 0; i < 5; i++) {
        // arr[i] = sc.nextInt();
        // }

        System.out.println("Sorted array: ");
        insertion(5, arr);

    }

    public static void bubble(int size, int arr[]) {

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void selection(int size, int arr[]) {
        for (int i = 0; i < size - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

    }

    public static void insertion(int size, int arr[]) {
        for (int i = 1; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

}
