package IM준비;

import java.util.Scanner;

public class swea2805_농작물수확 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				String str = sc.next();
				for(int j = 0; j < N; j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
			
			int center = N / 2;
			int sum = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					
					int d = Math.abs(center - i) + Math.abs(center - j);
					
					if(d <= center) {
						sum += arr[i][j];
					}
					
				}
			}
			
			
			
			System.out.println("#" + tc + " " + sum);
		}	// tc
	}		// main

}
