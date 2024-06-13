package BackTracking;

public class BackTrackSol {
	public static void main(String[] args) {
		System.out.println("Start");
		rec(1);
		System.out.print("Terminated");
	}
	
	public static void rec(int n) {
		if (n > 10)
			return;
		rec(n+1);
	}
}
