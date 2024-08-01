package Heaps;

import java.util.*;

public class MaxSubSeqHeap {
    public static void main(String[] args) {
        System.out.println(maxSubsequence(new int[]{2,1,3,3}, 2));
    }
    public static int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a->a[0]));
        for (int i = 0; i < nums.length;i++){
            if (minHeap.size() < k){
                minHeap.add(new int[]{ nums[i], i});
            }else if (nums[i] > minHeap.peek()[0]){
                minHeap.poll();
                minHeap.add(new int[]{nums[i],i});
            }
        }
        List<int[]> preRes = new ArrayList<>(minHeap);
        Collections.sort(preRes, Comparator.comparingInt(a->a[1]));

        for (int i = 0; i < res.length; i++) {
            res[i] = preRes.get(i)[0];
        }

        return res;
    }
}
