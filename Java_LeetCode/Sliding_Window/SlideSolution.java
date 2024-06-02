package Sliding_Window;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SlideSolution {
    public static void main(String[] args) {
        System.out.println(longestAlternatingSubarray(new int[]{3,2,5,4},5));
    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int lonSub = 0, start = 0, end = 0;
        while ( start < nums.length){
            // increase window
            if ( nums[start] % 2 == 0 && nums[start] <= threshold){
                int curLen = 1;
                end = start;
                while ( end+1 < nums.length && nums[end] <= threshold && nums[end+1] <= threshold && nums[end] % 2 != nums[end+1] % 2 ){
                    end++;
                    curLen++;
                }
                lonSub = Math.max(lonSub, curLen);
                start = end + 1;
            }
            else {
                start++;
            }
        }
        return lonSub;
    }

}
