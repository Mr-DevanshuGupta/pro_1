import java.util.*;
public class medianRuning {
    public static void main(String args[]){
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        double d = obj.findMedian();
        System.out.println(d);
    }
}


class MedianFinder {



    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {

        if(maxHeap.isEmpty() || maxHeap.peek() >= num){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }


        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if(maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()){
            // System.out.println(maxHeap.size());
            double d = maxHeap.peek()/2.0 + minHeap.peek()/2.0;
            return maxHeap.size();
        }
        else{

        return maxHeap.peek();
        }

    }
}
