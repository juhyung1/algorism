import java.util.Scanner;

public class bomb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int bomb = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			int max = 0;
	
			
			// 상하좌우
			int[] dr = {-1, 1, 0, 0};
			int[] dc = {0, 0, -1, 1};
			
			
			// 대각선
			int[] ddr = {-1, -1, 1, 1};
			int[] ddc = {-1, 1, -1, 1};
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					int sum1 = arr[i][j]; // 상하좌우 합
					int sum2 = arr[i][j]; // 대각선 합
					
						for(int k = 0; k < 4; k++) { 
							for(int a = 1; a <= bomb; a++) {
								
							
							int r1 = i + dr[k]*a;
							int c1 = j + dc[k]*a;
							
							
							int r2 = i + ddr[k]*a;
							int c2 = j + ddc[k]*a;
							
							if(r1 >= 0 && c1 >= 0 && r1 < N && c1 < N) {
								sum1 += arr[r1][c1];
							}
							if(r2 >= 0 && c2 >= 0 && r2 < N && c2 < N) {
								sum2 += arr[r2][c2];
							}
							
							
					}
						}
						
		

					max = Math.max(max, Math.max(sum1, sum2));
					

				}
			}
		
			System.out.println("#" + tc + " " + max);
			
			
		}	//tc
	}		// main
}
