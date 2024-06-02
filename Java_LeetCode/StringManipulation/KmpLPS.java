package StringManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KmpLPS {
    public static void main(String[] args) {
        //hay: AAAXAAAX needle1: AAACAAAA needle2:AAAA
//        System.out.println(strStr("sadbutsad","sad"));
//        System.out.println(strStr("leetcode","leeto"));
    }
    public static int strStr(String haystack, String needle) {
        int[] lps=GenerateLPS(needle);
        int i = 0, j = 0;
        while (i < haystack.length()){
            if (haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else {
                if (j==0){
                    i++;
                }else {
                    j = lps[j - 1];
                }
            }
            if (j == needle.length())
                return i - needle.length();
        }
        return -1;
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
