import java.util.Scanner;

public class swea1247_최적경로 {
	static int N;
	
	static int endX;
	static int endY;
	
	static int[][] arr;
	static boolean[] visited;
	static int min;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			
			N = sc.nextInt();
			
			arr = new int[2][N+1];
			
			arr[0][0] = sc.nextInt();
			arr[1][0] = sc.nextInt();
			
			endX = sc.nextInt();
			endY = sc.nextInt();
			
			for(int i = 1; i < N+1; i++) {
				arr[0][i] = sc.nextInt();
				arr[1][i] = sc.nextInt();
			}
			
						
			min = Integer.MAX_VALUE;
			visited = new boolean[N+1];
			
			dfs(0, arr[0][0], arr[1][0], 0);
			System.out.println("#" + tc + " " + min);		
			
		}	// tc
	}		// main
	
	// 방문한 고객 수, x좌표, y좌표, 총 거리 합
	static void dfs(int depth, int x, int y, int distance ) {
		
		// 현재 이동거리의 합이 최솟값보다 크면 더이상 볼 필요 없다.
		if(distance >= min) {
			return;
		}
		
		// 모든 고객을 방문한 경우
		if(depth == N) {
			distance += Math.abs(x - endX) + Math.abs(y - endY);
			min = Math.min(min, distance);
			return; // dfs()를 끝내고 dfs()를 호출했던 곳으로 되돌아간다.
		}
		
		// 방문할 고객을 선택한다
		for(int i = 1; i <= N; i++) {
			// 이미 방문했다면 건너뛰기
			if(visited[i]) {
				continue;
			}
			
			// i번째 고객을 방문하기 때문에 true로 변경
			visited[i] = true;
			
			// i번째 고객 좌표
			int nextX = arr[0][i];
			int nextY = arr[1][i];
			
			// 현재좌표에서 i번째 고객까지 거리
			int dis = Math.abs(x - nextX) + Math.abs(y - nextY);
			
			dfs(depth + 1, nextX, nextY, distance + dis);
			
			visited[i] = false;
			
			
		}
	}
	

}
