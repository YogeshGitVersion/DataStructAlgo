package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// How to solve the question when asked you can perform any operations
// any times any way we want but get max/min
public class WeeklySolution {
	public static void main(String[] args) {
		System.out.println(maxTotalReward(new int[]{1,1,3,3})); //84793457
		
	}
	 public static int maxTotalReward(int[] rewardValues) {
        int maxSum = 0;
        Arrays.sort(rewardValues);
//        System.out.print(Arrays.toString(rewardValues));
//        prefix sum
        for (int i = 0; i < rewardValues.length; i++) {
			int j = i+1;
			int curSum = rewardValues[i];
			while (j < rewardValues.length) {
				if (rewardValues[j] > curSum) {
					curSum+=rewardValues[j];
				}
				maxSum = Math.max(maxSum, curSum);
//				System.out.println(curSum);
				j++;
				
				}
			}
		 return maxSum;
	    }

}
