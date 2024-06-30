package StringManipulation;

import java.util.Arrays;

public class LongestSubSeq {
    public static void main(String[] args) {
        System.out.println(longSubSeq("abcde", "ace"));
    }
    public static int longSubSeq(String str1, String str2){
        int longSub = 0;
//        char[] c1 = str1.toCharArray();
//        char[] c2 = str2.toCharArray();

//        1. create a 2D array
        int m = str1.length(), n = str2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();

        }
//        2. traverse each possibility and store 1 if equal or 0 for not equal
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n ; j++) {
                if ( str1.charAt(i - 1) == str2.charAt( j - 1) ) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println("Updated");

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();

        }



        return dp[m][n];
    }
}
