package IM준비;

import java.util.Scanner;

public class swea25985_숫자열의최대곱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arrN = new int[N];
			int[] arrM = new int[(N-1)*2 + M];
			
			for(int i = 0; i < N; i++) {
				arrN[i] = sc.nextInt();
			}
			for(int i = N-1; i < M + N -1; i++) {
				arrM[i] = sc.nextInt();
			}
			int ans = Integer.MIN_VALUE;
			for(int i = 0; i < M + N - 1; i++) {
				int sum = 0;
				for(int j = 0; j < N; j++) {
					sum += arrN[j] * arrM[i + j];
					if(sum > ans)
						ans = sum;
				}
			}
			
			System.out.println("#" + tc + " " + ans);
		}	// tc
	}		// main

}
