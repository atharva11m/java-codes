package codingpoblems.array;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,44,44,55};
        int k=3;
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int num:arr){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        System.out.println("Kth Largest Element in an Array : "+minHeap.peek());
    }
}
