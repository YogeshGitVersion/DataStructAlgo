package Sliding_Window;

public class SlideSolutionLearn {
    public static void main(String[] args) {
//        maxSub(new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 3);
    }




}

class CustomTopicNotes{


//   1. ----- CustomTopicNotes notes = new CustomTopicNotes();
//        notes.windowVariableLen(new int[]{1, 4, 20, 3, 10, 5}, 33); ----
    public static void windowVariableLen(int[] arr, int sumTarget){
        int windowSum = arr[0], start = 0, last = -1;
        for (int i = 1; i < arr.length ; i++){
            while ( windowSum > sumTarget && start < i - 1)
            {
                last = i - 1;
                windowSum -= arr[start] ;
                start++;
            }
            if (windowSum == sumTarget) {
                System.out.println(start + " " + last);
                break;
            }
            windowSum+=arr[i];
        }
    }
//  2. ------ -   ----------
    public static void maxSub(int[] arr, int size){
        int maxNum = arr[0];
        for ( int i = 0; i <= arr.length - size; i++){
            maxNum = arr[i];
            for (int j = 1; j < size; j++)
            {
                if (maxNum < arr[i+j])
                    maxNum = arr[i+j];
            }
        }
    }
}

class LongestSubstringNotes{

    public static void longestNiceSubstring(String s){
        //Store the char freq in a Set.
        //iterate from 2 to s.len later but limit k = 2 now
//        int k = 2;
        String res = "";
        for (int k = 2; k <= s.length(); k++) {// sliding window
            for (int i = 0; i <= s.length() - k; i++) {
//                System.out.println(s.substring(i,i+k));
                if (isNicer(s,i,i+k-1 ) && k > res.length())
                    res = s.substring(i,i+k);
            }
            System.out.println();
        }
    }

    public static boolean isNicer(String s, int start, int end){
        int lower = 0, upper = 0;

        for (int i = start; i <= end; i++){
            char c = s.charAt(i);
            if ( Character.isLowerCase(c) )
                lower |= 1 << ( c - 'a');
            if ( Character.isUpperCase(c) )
                upper |= 1 << ( c - 'a');
        }
        return lower == upper;
    }
}
