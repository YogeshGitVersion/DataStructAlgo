package BackTracking;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(merge_sort(new int[] {5,2,3,1 })));
		
	}
	
	public static int[] merge_sort(int[] arr) {
		if (arr.length <= 1 || arr== null) {
			return arr;
		}
		
		int n = arr.length;
		
		for (int curSize = 1; curSize < arr.length; curSize = 2 * curSize) {
			for (int leftStart = 0; leftStart < arr.length - 1; leftStart+= 2 * curSize) {
				int mid = Math.min(leftStart + curSize - 1, n-1);
				int rightEnd = Math.min(leftStart + 2 * curSize - 1, n-1);
				merge(arr, leftStart, mid, rightEnd);
			}
			
		}
		
		return arr;
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int[] left_arr = new int[mid - left+1];
		int[] right_arr = new int[right - mid];
		
		for (int l = 0; l < right_arr.length; l++) {
			left_arr[l]=arr[left+l];
		}
		for (int m = 0; m < right_arr.length; m++) {
			right_arr[m]=arr[mid+1+m];
		}
		
		int i = 0, j = 0, k = left;
		
		while (i < left_arr.length && j < right_arr.length) {
			if (left_arr[i] <= right_arr[j]) {
				arr[k] = left_arr[i];
				i++;
			}else {
				arr[k] = right_arr[j];
				j++;
			}
			k++;
		}
		
		while (i < left_arr.length) {
			arr[k] = left_arr[i];
			i++;
			i++;
		}
		while (right < right_arr.length) {
			arr[k] = right_arr[j];
			j++;
			k++;
		}
	
	}
}
