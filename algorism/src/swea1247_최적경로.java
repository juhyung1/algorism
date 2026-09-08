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
			
			int[][] arr = new int[2][N+1];
			
			for(int i = 0; i < N+1; i++) {
				arr[0][i] = sc.nextInt();
				arr[1][i] = sc.nextInt();
			}
			
			endX = sc.nextInt();
			endY = sc.nextInt();	
			
			
			
			
			
			
			
			
		}	// tc
	}		// main
	
	
	static void dfs(int depth, int x, int y, int distance ) {
		if(depth == N) {
			return;
		}
	}
	

}
