package Greedy;

import java.awt.desktop.AboutHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;import java.util.function.IntPredicate;

public class MaximumTime {
	public static void main(String[] args) {
		System.out.println(maximumTime("0?:3?"));
	}
	public static String maximumTime(String time) {
        String res = "";
        char[] t = time.toCharArray();   
        if (t[0] == '?') {
			if (t[1] == '?' || t[1] <= '3') {
				t[0]='2';
			}else {
				t[0]='1';
			}
		}
        if (t[1] == '?') {
			if (t[0] == '2') {
				t[1]='3';
			}else {
				t[1]='9';
			}
			
		}
        if (t[3] == '?') {
			t[3] = '5';
			
		}else if (t[4] == '?') {
			t[4] = '9';
		}
        
        for (char c : t) {
			res+=c;
		}
		return res;
    }
    
}
