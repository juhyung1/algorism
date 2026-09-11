package IM준비;

import java.util.Scanner;

public class swea20230_풍선팡보너스게임2 {
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int ans = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					int sum = arr[i][j];
					for(int k = 0; k < 4; k++) {
						int nr = i + dr[k];
						int nc = j + dc[k];
						
						while(true) {
							if(nr < 0 || nc < 0 || nr >= N || nc >= N) {
								break;
							}
							sum += arr[nr][nc];
							nr += dr[k];
							nc += dc[k];
						}
						
					}
					
					ans = Math.max(sum, ans);
				}
			}
			
			System.out.println("#" + tc + " " + ans);

			
			
		}	// tc
	}		// main

}
