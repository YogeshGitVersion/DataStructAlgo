package DynamicProgramming;

public class AliceDivisorGame {
    public static void main(String[] args) {
        System.out.println(divisorGame(3));
    }
//    1 - can do; 0- cannot
    public static boolean divisorGame(int n) {
        boolean[] dp = new boolean[n+1];
//        Base case
        dp[1]=false;

        for (int i = 2; i <= n; i++) {
            for (int x = 1; x < i; x++) {
                if ( i % x == 0 && !dp[i-x]){
                    dp[i]= true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
