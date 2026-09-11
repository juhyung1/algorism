package IM준비;

import java.util.Scanner;

public class swea12712_파리퇴치3 {
	// 상하좌우
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	// 대각선, 좌상 우상 좌하 우하
	static int[] ddr = {-1, -1, 1, 1};
	static int[] ddc = {-1, 1, -1, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++ ) {
			int N = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			int M = sc.nextInt();
			
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int result = 0;		
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					int sum1 = arr[i][j];
					int sum2 = arr[i][j];
					
					for(int a = 0; a < 4; a++) {
						for(int b = 1; b <= M-1; b++) {
						int nr = i + dr[a] * b;
						int nc = j + dc[a] * b;
						
						int nnr = i + ddr[a] * b;
						int nnc = j + ddc[a] * b;
						
						if(nr >= 0 && nc >= 0 && nr < N && nc < N) {
							sum1 += arr[nr][nc];
						}
						if(nnr >= 0 && nnc >= 0 && nnr < N && nnc < N) {
							sum2 += arr[nnr][nnc];
						}			
						
					}					
				}
					
					result = Math.max(result, Math.max(sum1, sum2));
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}	// tc
	}		// main
	

}
