package MultiDSTopics;

import java.util.HashSet;
import java.util.Set;

/**
 * @author - yogesh
 * String, SLiding, HashTable
 */

public class LongSubString {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0, right = 0;
        Set<Character > seen = new HashSet<>();
        while (left < s.length() && right < s.length()){
            if ( !seen.contains(s.charAt(right))){
//                System.out.println(cur);
                seen.add(s.charAt(right++));
                maxLen = Math.max(maxLen, right-left);
            }else {
               seen.remove(s.charAt(left++));
            }
        }


        return maxLen;
    }
}
