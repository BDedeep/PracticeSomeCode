package topkFrequencyElement;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopkFrequencyEle {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int key : frequencyMap.keySet()){
            minHeap.add(key);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] ans = new int[k];
        int index = 0;
        while(!minHeap.isEmpty()){
            ans[index++] = minHeap.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        TopkFrequencyEle solution = new TopkFrequencyEle();
        int[] nums1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int k1 = 2;
        System.out.println(Arrays.toString(solution.topKFrequent(nums1, k1)));

        int[] nums2 = new int[]{8,2,3,4,4,6,7,1,5,10};
        int k2 = 2;
        System.out.println(Arrays.toString(solution.topKFrequent(nums1, k1)));
    }
}
