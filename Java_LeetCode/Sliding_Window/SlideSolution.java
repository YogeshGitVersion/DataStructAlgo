package Sliding_Window;

import java.util.*;

public class SlideSolution {
    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("YazaAay"));
//        System.out.println(longestNiceSubstring("bB"));
    }

    public static String longestNiceSubstring(String s) {
        String res = "";

        for (int k = 2; k <= s.length(); k++){
            for (int i = 0; i <= s.length() - k; i++) {
                String cur = s.substring(i, i + k);
               if (isNice(cur) && (cur.length() > res.length() ) ){
                   res = cur;
               }

            }
        }
        return res;

    }

    public static boolean isNice(String s) {
        // Use sets to store lowercase and uppercase characters
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower.add(c);
            } else if (Character.isUpperCase(c)) {
                upper.add(c);
            }
        }

        // Check if every character in the sets has its counterpart
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c) && !upper.contains(Character.toUpperCase(c))) {
                return false;
            }
            if (Character.isUpperCase(c) && !lower.contains(Character.toLowerCase(c))) {
                return false;
            }
        }
        return true;
    }
}
