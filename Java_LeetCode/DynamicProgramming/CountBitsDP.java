package DynamicProgramming;

import java.util.Arrays;

public class CountBitsDP {

    public static void main(String[] args) {
       System.out.println( countBits(5)); //[0,1,1,2,1,2]
    }
    public static int[] countBits(int n) {
     /*
     000 - 0
   1  001 - 1  1+dp[n-1] => 1+dp[n-2^0]
   2  010 - 1  1+dp[n-2] => 1+dp[n-2^1]
   3  011 - 2  1+dp[n-2] => 1+dp[n-2^1]
   4  100 - 1  1+dp[n-4] => 1+dp[n-2^2]
1,2,4,
      */
        int[] res = new int[n+1];
        helper(res,1,1);
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void helper(int[] dp, int idx, int ones){
        if (idx >= dp.length)
            return;
        dp[idx] =  ones;
        helper(dp, idx*2, ones);
        helper(dp, idx*2+1, ones+1);
    }
}
