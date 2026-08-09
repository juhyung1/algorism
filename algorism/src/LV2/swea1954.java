package LV2;

import java.util.Scanner;

public class swea1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int size = sc.nextInt();
			
			int[][] arr = new int[size][size];
			
			// 델타배열 우 하 좌 상
			int[] dr = {0, 1, 0, -1};
			int[] dc = {1, 0, -1, 0};
			
			int row = 0;
			int col = 0;
			
			int dir = 0; // 0(우), 1(하), 2(좌), 3(상)
			
			for(int i = 1; i <= size*size; i++) {
				arr[row][col] = i;
				
				int nr = row + dr[dir];
				int nc = col + dc[dir];
				
				// 배열의 위치를 벗어나거나 값이 있을 때
				if(nr < 0 || nr >= size || nc < 0 || nc >= size ||
						arr[nr][nc] != 0) {
					
					dir = (dir + 1) % 4;
					
					nr = row + dr[dir];
					nc = col + dc[dir];
				}
				row = nr;
				col = nc;
				
			}
			System.out.println("#" + test_case);
			
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			

			
			
		} //tc
	} // main
}
