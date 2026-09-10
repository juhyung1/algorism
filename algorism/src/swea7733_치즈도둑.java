import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class swea7733_치즈도둑 {
	static int N;
	static int[][] arr;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			arr = new int[N][N];
			
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
					max = Math.max(max, arr[i][j]);
				}
			}
			
			int ans = 1; // 전체가 1덩어리 이므로 1 시작
			
			boolean[][] eat = new boolean[N][N];
			for(int day = 1; day < max; day++) {
				for(int i = 0; i < N; i++) {
					for(int j = 0; j < N; j++) {
						if(arr[i][j] <= day) {
							eat[i][j] = true;
						}
					} 
				}	// day 날짜의 치즈를 다 먹음
				
				boolean[][] visited = new boolean[N][N];
				
				int count = 0; // 치즈 덩어리 수
				
				
				Queue<int[]> q = new ArrayDeque<>();
				for(int i = 0; i < N; i++) {
					for(int j = 0; j < N; j++) {
						// 행 우선순회 바식, 남은 치즈 덩어리 수 구하기
						if(eat[i][j]) continue;
						
						if(visited[i][j]) continue;
						
						// 방문 체크가 되지 않았다면 덩어리를 카운트
						q.add(new int[] {i, j});
						visited[i][j] = true;
						count++;			
						
						while(!q.isEmpty()) {
							int[] curr = q.poll();
							// 덩어리는 4방향 인접이면 한덩어리로 간주한다
							for(int d = 0; d < 4; d++) {
								int nr = curr[0] + dr[d];
								int nc = curr[1] + dc[d];
								
								// 1. 범위 체크
								if(nr < 0 || nr >= N || nc < 0 || nc >= N) {
									continue;
								}
								// 2. eat 체크
								if(eat[nr][nc]) {
									continue;									
								}
								
								if(visited[nr][nc]) {
									continue;									
								}
								
								q.add(new int[] {nr, nc});
								visited[nr][nc] = true;								
								
							}	// 4방향 탐색
						}		// 덩어리 완성			
					}			// 열
				}				// 행
				ans = Math.max(count,  ans);				
			}
			
			System.out.println("#" + tc + " " + ans);
		}	// tc
	}		// main
	
	public static void bfs() {
		
	}
}
