import java.util.*;

public class coutSort {
    public static void main(String args[]){
        int arr[] = {1,3,2,4,2,1,6,2,5};
        coutSort ob = new coutSort();

        ob.sort(arr, arr.length);
        
    }

    void sort(int arr[], int n){
        int k = arr[0];
        for(int i=0;i<n;i++){
            k = Math.max(k, arr[i]);
        }
        int count[] = new int[k+1];

        for(int i=0;i<=k;i++){
            count[i]=0;
        }

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        for(int i=1;i<=k;i++){
            count[i] += count[i-1];
        }

        int output[] = new int[n];

        for(int i=n-1;i>=0;i--){
            output[--count[arr[i]]]  = arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.println(output[i]);
        }
    }

}
