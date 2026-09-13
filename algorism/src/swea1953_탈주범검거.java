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
	
	static class Person {	// 현재 행 위치, 열 위치, 걸린시간
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
			
			ans = 1;	// 시간 1일때 맨홀 위치(방문처리)
			
			bfs();
			
			System.out.println("#" + tc + " " + ans);

			
			
		}	// tc
	}		// main
	
	
	public static void bfs() {
		// 방문 배열을 이곳에서 생성해도 좋다
		
		// Queue에 현재 위치(행,열) 시간 저장
		Queue<Person> q = new ArrayDeque<>();
		q.add(new Person(R, C, 1)); 
		visited[R][C] = true;
		
		
		// queue 안에 내용이 빌때까지 무한반복
		while(!q.isEmpty()) {
			Person p = q.poll(); // 현재 위치 꺼내기
			
			
			if(p.time == L) { // 현재 꺼낸 탈주범의 시간이 L일때 continue
				break;
			}
			
			// 현재 탈주범의 터널 타입
			int type = map[p.r][p.c]; // 현재 탈주범이 있는 위치의 터널 타입
			
			for(int d : tunnel[type]) {	// 현재 터널에서 갈 수 있는 방향 탐색
				int nr = p.r + dr[d];
				int nc = p.c + dc[d];
				
				// 배열을 벗어나거나 이미 방문한 곳이면 이동x
				if(nr < 0 || nc < 0 || nr >= N || nc >= M || visited[nr][nc]) {
					continue;
				}
				
				// 다음 위치에 터널이 없다면 이동 불가
				if(map[nr][nc] == 0) {
					continue;
				}
				
				int nextType = map[nr][nc]; // 다음 터널
				int d2 = (d + 2) % 4;		// 반대방향
				
				// 다음 터널에 반대방향 통로가 없다면 이동x
				if(!canMove(nextType, d2)) continue;
				
				
				// 방문 실시
				q.add(new Person(nr, nc, p.time + 1));
				visited[nr][nc] = true;
				ans++;
				
			}
			
			
		}
		
	}


	private static boolean canMove(int type, int dir) { // 다음 터널의 타입과, 방향
		for(int d : tunnel[type]) { // 해당 터널이 이동할 수 있는 방향들을 하나씩 확인
			if(d == dir) return true; // 이동 가능하면 true
		}
		return false; // 방향 없으면 false
	}
}




