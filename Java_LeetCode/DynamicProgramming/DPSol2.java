package DynamicProgramming;

import java.util.Arrays;

public class DPSol2 {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
//        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int[] newCost = new int[cost.length+1];
        for (int i = 0; i < cost.length; i++) {
            newCost[i]= cost[i];
        }
        /*
            10,15,20
               ^
            ^
          ^
         */

        for (int i = cost.length-3; i >= 0 ; i--) {
            cost[i] += Math.min(cost[i+2],cost[i+1]);
        }
        System.out.println(Arrays.toString(cost));

        return Math.min(cost[0], cost[1]);
    }

}
