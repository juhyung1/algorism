import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class swea1953_탈주범검거 {
	static int N, M, R, C, L, ans;
	static int[][] map;
	static boolean[][] visited;
	// 우 하 좌 상
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0, -1, 0};
	
	static int[][] tunnel = {
			{}, // 0번 인덱스는 버린다
			{0,1,2,3}, 	// +모양은 전부 이동 가능
			{1, 3},		// 하상
			{0, 2},		// 우좌
			{0, 3},		// 우상
			{0, 1},		// 우하
			{1, 2},		// 하좌
			{2, 3},		// 좌상			
	};
	
	static class Person {
		int r, c, time;

		public Person(int r, int c, int time) {
			this.r = r;
			this.c = c;
			this.time = time;
		}	
	}		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();	// 세로 크기
			M = sc.nextInt();	// 가로 크기
			R = sc.nextInt();	// 맨홀 뚜껑 세로위치
			C = sc.nextInt();	// 맨홀 뚜껑 가로위치
			L = sc.nextInt();	// 탈출 후 소요 시간
			
			
			map = new int[N][M];
			visited = new boolean[N][M];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					map[i][j] = sc.nextInt();
				}
			}// 입력 끝
			
			ans = 1;
			
			bfs();
			
			System.out.println("#" + tc + " " + ans);

			
			
		}	// tc
	}		// main
	
	
	public static void bfs() {
		// 방문 배열을 이곳에서 생성해도 좋다
		
		Queue<Person> q = new ArrayDeque<>();
		q.add(new Person(R, C, 1));
		visited[R][C] = true;
		
		
		while(!q.isEmpty()) {
			Person p = q.poll();
			
			
			if(p.time == L) { // 현재 꺼낸 탈주범의 시간이 L일때 continue vs break;
				continue;
			}
			
			// 나일 터널 타입
			int type = map[p.r][p.c]; // 현재 탈주범이 있는 위치의 터널 타입
			for(int d : tunnel[type]) {	// 현재 터널에서 갈 수 있는 방향들이
				int nr = p.r + dr[d];
				int nc = p.c + dc[d];
				
				// 범위 체크, 방문 체크
				if(nr < 0 || nc < 0 || nr >= N || nc >= M || visited[nr][nc]) {
					continue;
				}
				
				// 터널 체크
				if(map[nr][nc] == 0) {
					continue;
				}
				
				int nextType = map[nr][nc]; // 다음 터널
				int d2 = (d + 2) % 4;		// 반대방향을 뽑아 낼 수 있다
				
				// 다음 터널과 현재 터널에 이어져있는 방향을 알고 있다.
				if(!canMove(nextType, d2)) continue;
				
				q.add(new Person(nr, nc, p.time + 1));
				visited[nr][nc] = true;
				
			}
			
			
		}
		
	}


	private static boolean canMove(int type, int dir) {
		for(int d : tunnel[type]) {
			if(d == dir) return true;
		}
		return false;
	}
	
	
}
