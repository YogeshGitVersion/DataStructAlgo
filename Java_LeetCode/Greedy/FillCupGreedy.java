package Greedy;

public class FillCupGreedy {
    public static void main(String[] args) {
        System.out.println(fillCups(new int[]{3,4,5}));
    }
    public static int fillCups(int[] amount) {
       int max = 0, sum = 0;
       for(int i : amount){
           max = Math.max(max, i);
           sum+=i;
       }
       // sum determines the pairing startegy when divided by 2
       return Math.max(max, (sum+1)/2);
    }
}
