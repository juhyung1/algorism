package IM준비;

import java.util.Scanner;

public class swea10760_우주선착륙 {
	static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int[] dc = {0, 0, -1, 1, -1 , 1, -1, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] arr = new int[N][M];
			
			int result = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
							
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					int count = 0;
				
					
					for(int k = 0; k < 8; k++) {
						int nr = i + dr[k];
						int nc = j + dc[k];
						
						if(nr >= 0 && nc >= 0 && nr < N && nc < M) {
							if(arr[i][j] > arr[nr][nc])	count++;
							
						}
						
											
					}			
					if(count >= 4) {
						result++;
					}
				}
			}
			
			
			
			
			System.out.println("#" + tc + " " + result);
			
			
			
		}	// tc
	}		// main
}
