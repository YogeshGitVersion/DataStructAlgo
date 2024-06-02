package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(minimumChairs("EEEEEEE"));
        System.out.println(countDays(10, new int[][]{{5,7},{1,3},{9,10}}));
//        System.out.println(countDays(5, new int[][]{{2,4},{1,3}}));
//        System.out.println(countDays(6, new int[][]{{1,6}}));
    }
    public static int countDays(int days, int[][] meetings) {
        int freeDays = 0;
        int[] schedule = new int[days];
        for (int i = 0; i < meetings.length; i++ ){
            int start = meetings[i][0];
            int end = meetings[i][1];
            for (int j = start; j <= end; j++){
                schedule[j-1]++;
            }
        }
//        System.out.println(Arrays.toString(schedule));
//        freeDays = (int) Arrays.stream(schedule).filter(x -> x==0).count();
        for (int day = 0; day < schedule.length; day++){
            if(schedule[day] == 0)
                freeDays++;
        }
        return freeDays;
    }
}
