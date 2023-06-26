import java.util.PriorityQueue;

public class kthlargest {
    public static void main(String args[]) {
        int arr[] = { 12, 2, 1, 5, 3, 15, 56, 43 };

        klar(arr, 5);
    }

    static void klar(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
