package IM준비;

import java.util.Scanner;

public class swea1289_원재의메모리복구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			
			int count = 0;
			char ch = '0';
			
			for(int i = 0; i < str.length(); i++) {
				char curr = str.charAt(i);
				
				if(curr != ch) {
					count++;
					ch = curr;
				}
			}
			
			System.out.println("#" + tc + " " + count);
			
		}	// tc
	}		// main
}
