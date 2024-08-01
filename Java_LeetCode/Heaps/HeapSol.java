package Heaps;

import java.util.PriorityQueue;
import java.util.Set;

public class HeapSol {
    public static void main(String[] args) {
        System.out.println(largestInteger(1234));//4321
    }
    public static int largestInteger(int num) {
        // until half way swap with largest same parity
        char[] digits = String.valueOf(num).toCharArray();
        PriorityQueue<Integer> oddMaxHeap = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> evenMaxHeap = new PriorityQueue<>((a,c)->c-a);

        int i = num;
        while(i >= 1){
            int cur = (i % 10);
            if ( cur%2 == 0){
                evenMaxHeap.offer(cur);
            }else {
                oddMaxHeap.offer(cur);
            }
            i/=10;
        }
        for (int j = 0; j < digits.length; j++){
            int cur = digits[j]-'0';
            if (cur%2 == 0){
                digits[j] = (char) (evenMaxHeap.poll()+'0');
            }else {
                digits[j] = (char) (oddMaxHeap.poll()+'0');
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
