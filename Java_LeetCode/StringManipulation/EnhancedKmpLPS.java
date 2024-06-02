package StringManipulation;

import java.util.*;

public class EnhancedKmpLPS {
    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass","as","hero","superhero"}));
    }
    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length; j++){
                if (i!=j && isPref(words[j],words[i]))
                {
                    result.add(words[i]);
                    break;
                }
            }
        }
    return new ArrayList<>(result);
    }
    public static boolean isPref(String haystack, String needle){
        if(haystack.length() < needle.length()) return false;
        int[] lps=GenerateLPS(needle);
        int i =0, j =0;
        while ( i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }if (j == needle.length())
                return true;
            // change
            if (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                if (j == 0){
                    i++;
                }else {
                    j = lps[j-1];
                }
            }
        }

        return false;
    }
    public static int[] GenerateLPS(String needle){
        if (needle.isEmpty()) return new int[]{};
        //at each idx long len of pref and suf is stored
        int[] lps = new int[needle.length()];
        lps[0] = 0; // why?
        int i = 1, lpsLen = lps.length, prevLps = 0;

        while (i < needle.length()){
            // if pref == suf
            if (needle.charAt(i) == needle.charAt(prevLps)){
                prevLps++;
                lps[i] = prevLps;
                i++;
            }
            else {//when {prefix != suf} @C for AAACAAA
                // check if start of needle
                if (prevLps == 0){
                    lps[i]=0;
                    i++;
                }
                else {// previous idx len is not 0
//                    just move back but not to front
//                    check prev will have same char
                    prevLps = lps[prevLps-1];
                }
            }
        }
        return lps;
    }
}
