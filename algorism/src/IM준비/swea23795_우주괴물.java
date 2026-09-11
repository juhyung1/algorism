package IM준비;

import java.util.Scanner;

public class swea23795_우주괴물 {

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			int[][] arr = new int[N][N];
			// 괴물 좌표 저장
			int r = 0;
			int c = 0;

			int ans = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();

					if (arr[i][j] == 2) {
						r = i;
						c = j;
					}
				}
			}

			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				while (true) {

					if (nr < 0 || nc < 0 || nr >= N || nc >= N) {
						break;
					}
					if (arr[nr][nc] == 1) {
						break;
					}
					if(arr[nr][nc] == 0)
					arr[nr][nc] = -1;
					
					nr += dr[i];
					nc += dc[i];
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == 0) {
						ans++;
					}
				}
			}
			System.out.println("#" + tc + " " + ans);

		} // tc
	} // main
}
