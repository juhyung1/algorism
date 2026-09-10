package 모의SW역량테스트;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class swea_1953_탈주범검거 {
	static int N, M, R, C, L, ans; // N*M, (R,C), L시간, 결과
	static int[][] map;
	static boolean[][] visited;	// 방문처리용
	
	// 우 하 좌 상
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0 ,-1, 0};
	
	// 터널 모든 테스크에시트에서 공용으로 사용 
	static int[][] tunnel = {
			{}, // 0번 인덱스는 버린다
			{0, 1, 2, 3},	// + 모양은 전부 이동가능
			{1, 3},			// 하상
			{0, 2},			// 우좌
			{0, 3},			// 우상
			{0, 1},			// 우하
			{1, 2},			// 하좌
			{2, 3}			// 좌상		
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
			N = sc.nextInt();	// 행 크기
			M = sc.nextInt();	// 열 크기
			R = sc.nextInt();	// 행 좌표
			C = sc.nextInt();	// 열 좌표
			L = sc.nextInt();	// 시간 (1~20)
			
			map = new int[N][M];
			visited = new boolean[N][M];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			ans = 1;
			
			// 탈주범 move 시작
			bfs();
			
			
			System.out.println("#" + tc + " " + ans);
			
			
		}// tc
		
	}// main
	
	
	public static void bfs() {
		// 방문배열을 이곳에서 생성해도 좋다.
		
		Queue<Person> q = new ArrayDeque<>();
		q.add(new Person(R, C, 1));	// 첫 시간에는 맨홀뚜껑 위치에 있기 때문에 1, 초기값(시작지점)
		visited[R][C] = true;	// 시작지점 방문처리
		
		while(!q.isEmpty()) {
			Person p = q.poll();// 현재 사람을 하나 꺼내(탈주범 꺼내기)
			
			if(p.time == L) {	// 현재 꺼낸 탈주범의 시간이 L일 때
				continue;
			}
			
			// 나의 터널 타입
			int type = map[p.r][p.c]; // 현재 탈주범이 있는 위치의 터널 타입
			for(int d : tunnel[type]) {	// 현재 터널에서 갈 수 있는 방향들
				int nr = p.r + dr[d];
				int nc = p.c + dc[d];
				
				// 범위체크, 방문체크
				if(nr < 0 || nc < 0 || nr >= N || nc >= M || visited[nr][nc]) {
					continue;
				}
				//터널체크
				if(map[nr][nc] == 0) { // 터널이 아니면 건너뛰기
					continue;
				}
				
				int nextType = map[nr][nc]; // 다음 좌표의 터널 타입
				int d2 = (d+2) % 4; // 나의 반대방향
				
				// 다음 터널과 현재 터널에 이어져있는 방향을 알고있음
				if(!canMove(nextType, d2)) continue; // 가고싶은 방향에 갈수 없다면
				
				// 이제는 갈 수 있다
				q.add(new Person(nr, nc, p.time+1));
				visited[nr][nc] = true;	// 다음좌표 이동
				ans++;
			}
			
		}		
	}


	static boolean canMove(int type, int dir) {
		for(int d : tunnel[type]) {
			if(d == dir) return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
