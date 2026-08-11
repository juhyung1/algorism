package LV3;

import java.util.Scanner;

public class swea26009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			long sumA = (long)a * (a+1) / 2;
			long sumB = (long)b * (b+1) / 2;
			long sumC = (long)c * (c+1) / 2;
			
			long resultA = sumA % 998244353;
			long resultB = sumB % 998244353;
			long resultC = sumC % 998244353;
			
			
			
			
			
			
			
		}	// tc
	}		// main
}
