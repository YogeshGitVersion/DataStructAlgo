package StringManipulation;

import java.util.*;

public class StringManSolution {
    public static void main(String[] args) {
    	System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> resultList = new ArrayList<List<String>>();
    	for (int i = 0; i < strs.length; i++) {
    		List<String> curList = new ArrayList<String>();
			for (int j = i+1; j < strs.length; j++) {
				if (isAnagram(strs[i], strs[j])) {
					curList.add(strs[j]);
				}
			}

				resultList.add(curList);
			
		}
    	return resultList;   
    }
    
    public static boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) return false;
        int[] orig = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            orig[s.charAt(i) - 'a']++;
            orig[t.charAt(i) - 'a']--;
        }
        for(int x: orig){
            if(x >= 1)
                return false;
        }  
        return true;
    	
	}
    
}
