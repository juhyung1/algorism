package IM준비;

import java.util.Scanner;

public class swea8702_당근수확 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int[] sumA = new int[N-1];
			int[] sumB = new int[N-1];		
			
			int idx = 1;
			int min = Integer.MAX_VALUE;
			
			int sumAA = 0;
			for(int i = 0; i < N-1; i++) {
				sumAA += arr[i];
				sumA[i] = sumAA;				
			}
			
			int sumBB = 0;
			for(int i = N-1; i > 0; i--) {
				sumBB += arr[i];
				sumB[i-1] = sumBB;
			}
			
			for(int i = 0; i < N-1; i++) {
				int minus = Math.abs(sumA[i] - sumB[i]);
				if(minus < min) {
					min = minus;
					idx = i + 1;					
				}
			}
			
			System.out.println("#" + tc + " " + idx + " " + min);		
		}	// tc
	}		// main
}
