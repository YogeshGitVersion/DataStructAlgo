package Scratch;

import java.util.HashSet;

public class Scratch {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int c = 0;
       HashSet<Character> found = new HashSet<>();
        for(char ch:jewels.toCharArray()){
            found.add(ch);
        }
        for(char s:stones.toCharArray()){
            if(found.contains(s)){
                c++;
            }
        }
        return c;
    }
}
