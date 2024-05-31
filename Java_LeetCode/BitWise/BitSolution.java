package BitWise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BitSolution {
    public static void main(String[] args) {
//        System.out.println(minOperations(new ArrayList<>(Arrays.asList(3,1,5,4,2)),5));
//        System.out.println(minOperations(new ArrayList<>(Arrays.asList(3,1,5,4,2)),2));
        System.out.println(minOperations(new ArrayList<>(Arrays.asList(3,2,5,3,1)),3));

    }
    public static int minOperations(List<Integer> nums, int k) {
        int  count = 0, operations = 0;
//        int[] set = new int[k];
        int tarMask = (1 << k) - 1;

        for (int i = nums.size() - 1; i >= 0; i--){
            int num = nums.get(i);
            operations++;
            if (num <= k){
                count |= (1 << num -1);
                if (count == tarMask)break;

            }
        }

        return operations;
    }
}
