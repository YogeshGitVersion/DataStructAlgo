package StringManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LetterCombo {
	private static  Map<Character, String> digitToChar = new HashMap<>();
    static {
	digitToChar.put('2', "abc");
    digitToChar.put('3', "def");
    digitToChar.put('4', "ghi");
    digitToChar.put('5', "jkl");
    digitToChar.put('6', "mno");
    digitToChar.put('7', "pqrs");
    digitToChar.put('8', "tuv");
    digitToChar.put('9', "wxyz");
    }
    
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}
	
	public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
            return res;
        }
        
        
        backtrack(0, new StringBuilder(), digits, res);
        return res;
    }
    
    private static void backtrack(int index, StringBuilder curStr, String digits, List<String> res) {
        if (curStr.length() == digits.length()) {
            res.add(curStr.toString());
            return;
        }
        
        String possibleChars = digitToChar.get(digits.charAt(index));
//        iterates over all strings of letters in level 2
//        {a -> d},{a -> e},{a-> f}
//        curStr is a, c is (d,e,f) 
        for (char c : possibleChars.toCharArray()) {
            curStr.append(c);
            backtrack(index + 1, curStr, digits, res);
            curStr.deleteCharAt(curStr.length() - 1);
        }
    }

}
