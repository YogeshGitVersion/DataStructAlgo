package Greedy;

public class GreedySol {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(11891));
//        System.out.println(minMaxDifference(90));
    }
    public static int minMaxDifference(int num) {
        //smallest - 9 -> max
        //largest -  0 or 1 -> min
        int min = Integer.MAX_VALUE;
        String s  = String.valueOf(num);
        for (char c: s.toCharArray()){
            if (c - '0' < min)
                min = c;
        }

        String maxD =  s.replace((char) (min), '9');
        int max = 0;
        for (char c: maxD.toCharArray()){
            if ( c - '0' > max)
                max = c;
        }
        String minD =  maxD.replace((char) (max), '0');


//        System.out.println( (Integer.parseInt(maxD)-Integer.parseInt(minD) ));

        return -1;
    }
}
