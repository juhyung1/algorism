import java.util.Scanner;

public class swea2105_디저트카페 {
	static int N;
	static int[][] map;
	// 우상 우하 좌상 좌하(시계방향
	static int[] dr = {-1, 1, 1, -1};
	static int[] dc = {1, 1, -1, -1};
	static int ans; // 디저트 최대 개수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new int[N+2][N+2];
			
			for(int i = 1; i < N+1; i++) {
				for(int j = 1; j < N+1; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < N+2; i++) {
				map[0][i] = map[N+1][i] = map[i][0] = map[i][N+1] = 0;
			}
			
			ans = 0;
			
			// 출발은 어느 한 카페
			for(int i = 1; i < N+1; i++) {
				for(int j = 1; j < N+1; j++) {
					boolean[] eat = new boolean[101];
					eat[0] = true;
					move(new int[] {i, j}, new int[] {i, j}, eat, 0);
				}	// 출발지 결정
			}
						
			
			System.out.println("#" + tc + " " + (ans == 0 ? -1 : ans));
			
			
			
		}	//tc

	} // main
	
	// start : 해당 디저트 투어에서 출발한 위치
	// curr : 현재 나의 위치
	// eat : 이번 투어에서 먹은 디저트들
	// dir : 현재 나의 방향
	private static void move(int[] start, int[] curr, boolean[] eat, int dir) {
		// 종료파트
		if(start[0] == curr[0] && start[1] == curr[1] && dir == 3) {
			// 투어 끝
			int cnt = 0;
			for(int i = 1; i <= 100; i++) {
				if(eat[i]) cnt++;
			}	// cnt 집계 완료
			ans = Math.max(ans, cnt);
			return;
		}
		
		
		// 재귀 조건
		// dir 0 -> 0 1   /    1 -> 1 2		/ 	2 -> 2 3	/ 3 -> 3
		for(int i = dir; i < dir+2 && i < 4; i++) {
			int nr = curr[0] + dr[i];
			int nc = curr[1] + dc[i];
			
			// 범위 체크 -> 필요없음 (주변을 다 0으로 초기화했기 때문)
			int idx = map[nr][nc];
			if(eat[idx]) continue; // 먹은 디저트라면 생략
			eat[idx] = true;
			move(start, new int[] {nr, nc}, eat, i);
		}
		
	}	// main

}
