package Contest;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maximumLength(new int[]{1,2,1,1,3},2));
    }
    public static int maximumLength(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;
        int distinctCount = 0;
        int[] count = new int[100001]; // Assuming the range of nums is within [0, 100000]

        for (int i = 0; i < n; i++) {
            if (count[nums[i]] == 0) {
                distinctCount++;
            }

            count[nums[i]]++;

            if (i >= k) {
                count[nums[i - k]]--;
                if (count[nums[i - k]] == 0) {
                    distinctCount--;
                }
            }

            maxLen = Math.max(maxLen, distinctCount);
        }

        return maxLen;
    }

}
