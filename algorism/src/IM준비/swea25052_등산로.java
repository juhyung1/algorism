package IM준비;

import java.util.Scanner;

public class swea25052_등산로 {
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
			
			int ans = 1;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					
					// 현재 좌표
					int r = i;
					int c = j;	
					
					int count = 1;
					
					while(true) {
						
						int min = arr[r][c];
						
						int nextR = r;
						int nextC = c;
					
					for(int k = 0; k < 4; k++) {
						int nr = r + dr[k];
						int nc = c + dc[k];
						
						if(nr < 0 || nc < 0 || nr >= N || nc >= N) {
							continue;
						}
						if(arr[nr][nc] < min) {
							min = arr[nr][nc];
							nextR = nr;
							nextC = nc;
						}						
						
					}
					if(nextR == r && nextC == c) {
						break;
					}
					
					r = nextR;
					c = nextC;
					count++;
					
					}		
					ans = Math.max(count, ans);
					
				}
			}		
			
			
			System.out.println("#" + tc + " " + ans);
			
		}	// tc
	}		// main

}
