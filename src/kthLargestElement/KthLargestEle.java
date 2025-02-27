package kthLargestElement;

import java.util.PriorityQueue;

public class KthLargestEle {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num = 0; num < nums.length; num++){
            minHeap.offer(nums[num]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestEle obj = new KthLargestEle();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(obj.findKthLargest(nums, k));
    }
}
