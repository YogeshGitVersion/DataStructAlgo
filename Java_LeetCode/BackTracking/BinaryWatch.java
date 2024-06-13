package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
	public static void main(String[] args) {
		System.out.println(readBinaryWatch(1));
	}
	
	 public static List<String> readBinaryWatch(int turnedOn) {
		    //  iterate through all possible h:m and count '1'
		 List<String> res = new ArrayList<String>();
		 if (turnedOn < 0 || turnedOn > 10) {
			 return res;
		}
		 backtracking(res, turnedOn, 0, 0, 0);	 
		 return res;		 
	 }

	public static void backtracking(List<String> res, int turnedOn, int start, int h, int m) {
		if (turnedOn == 0) {
			if (h < 12 && m < 60) {
				res.add(String.format("%d:%02d",h, m));
			}return;
		}
		for (int i = start; i < 10; i++) {
			if (i < 4) {
				backtracking(res, turnedOn - 1, i+1, h+(1<<i), m);				
			}else {
				backtracking(res, turnedOn - 1, i+1, h, m+(1 << (i - 4)));
			}

		}
		
		
	}

	
	 
	 
}
