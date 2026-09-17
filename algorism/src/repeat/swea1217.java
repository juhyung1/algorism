package repeat;

import java.util.Scanner;

public class swea1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++)  {
			int T = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			
			System.out.println("#" + tc + " " + pow(N, M));
			
			
		}	// tc
	}		// main
	
	static int pow(int a, int b) {
		if(b == 0) return 1;
		
		return a * pow(a, b-1);
	}

}
