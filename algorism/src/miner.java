import java.util.Scanner;

public class miner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] arr = new int[N][N];

		int row = 0;
		int col = 0;
		

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 0) {
					row = i;
					col = j;
				}
			}
		}

		System.out.println("광부 위치 : (" + row + "," + col + ")");

		int move = sc.nextInt(); // 움직이는 횟수
		sc.nextLine();
		String act = sc.next(); // 방향 or 다이너마이트
		int count = 0; // 암석 부순 개수

		char[] acting = act.toCharArray();
		int idx = 0;

		int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
		int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

		for (int i = 0; i < move; i++) {

			// 상
			if (acting[idx] == 'U' && row > 0) {
				arr[row - 1][col]--;
				if (arr[row - 1][col] == 0) {
					count++;
					row--;
				}
			}

			// 하
			else if (acting[idx] == 'D' && row < N - 1) {
				arr[row + 1][col]--;
				if (arr[row + 1][col] == 0) {
					count++;
					row++;
				}
			}

			// 좌
			else if (acting[idx] == 'L' && col > 0) {
				arr[row][col - 1]--;
				if (arr[row][col - 1] == 0) {
					count++;
					col--;
				}
			}

			// 우
			else if (acting[idx] == 'R' && col < N - 1) {
				arr[row][col + 1]--;
				if (arr[row][col + 1] == 0) {
					count++;
					col++;
				}
			}
			
			// 다이너마이트
			else if(acting[idx] == 'X') {
				for(int k = 0; k < 8; k++) {
					int nrow = row + dr[k];
					int ncol = col + dr[k];
					
					if(nrow >= 0 && nrow < N &&
						ncol >= 0 && ncol < N &&
						arr[nrow][ncol] > 0) {
						
						arr[nrow][ncol] = 0;
						count++;
					}
					
				}
			}
			

		} // k for문
		
		
		System.out.println("부순 암석 개수 : " + count);

	} // main
}
