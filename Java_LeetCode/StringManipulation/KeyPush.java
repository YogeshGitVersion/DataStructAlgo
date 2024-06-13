package StringManipulation;

import java.util.*;

public class KeyPush {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        // Create a map to store the mapping of digits to letters
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(result, map, digits, 0, new StringBuilder());
        return result;
    }

    private static void backtrack(List<String> result, Map<Character, String> map, String digits, int index, StringBuilder combination) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            combination.append(letters.charAt(i));
            backtrack(result, map, digits, index + 1, combination);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
