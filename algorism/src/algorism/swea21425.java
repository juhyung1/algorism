package algorism;

import java.util.Scanner;

public class swea21425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			
			long a = sc.nextInt();
			long b = sc.nextInt();
			long n = sc.nextInt();
						
			int count = 0;
			
			while(true) {
				if(a < b) {
					a += b;
					count++;
					if(a > n) break;
				}
				else {
					b += a;
					count++;
					if(b > n) break;
				}
			}
			
			System.out.println("#" + test_case + " " + count);	
			
		}// tc
	}// main

}
