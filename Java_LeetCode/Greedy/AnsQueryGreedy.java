package Greedy;

import java.util.Arrays;

public class AnsQueryGreedy {
	public static void main(String[] args) {
		System.out.println(answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21}));
//		System.out.println(answerQueries(new int[]{2,3,4,5}, new int[]{1}));
//		System.out.println(answerQueries(new int[]{736411,184882,914641,37925,214915},
//				new int[]{331244,273144,118983,118252,305688,718089,665450}));


	}

	public static int[] answerQueries(int[] nums, int[] queries) {
//		1. Sort Array
		Arrays.sort(nums);

//		2. Prefix sum
		int[] prefixSum = new int[nums.length];
		prefixSum[0]=nums[0];
		for (int i = 1; i < nums.length; i++) {
			prefixSum[i] = prefixSum[i-1] + nums[i];
		}

		int[] res = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			res[i] = binarySearch(prefixSum, queries[i]);
		}
		System.out.println(Arrays.toString(res));
	return res;
	}

	public static int binarySearch(int[] arr, int tar){
		int left = 0, right = arr.length - 1;
		while (left <= right){
			int mid  = left + (right - left) / 2;
			if (arr[mid] <= tar) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;
	}



}
