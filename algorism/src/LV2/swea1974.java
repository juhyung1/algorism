package LV2;

import java.util.Scanner;

public class swea1974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int[][] arr = new int[9][9];
			
			for(int i = 0; i< 9; i++) {
				for(int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int result = 1; // 스도쿠가 된다고 가정하고 시작
			
			// 행 탐색
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 8; j++) { // 마지막 8에서는 비교할 대상이 없음
					
					for(int k = j + 1; k < 9; k++) {
						if(arr[i][j] == arr[i][k]) {
							result = 0;
						}						
					} //k
					
				}//j
			}//i
			
			
			// 열 탐색
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 8; j++) {
					for(int k = j + 1; k < 9; k++) {
						if(arr[j][i] == arr[k][i]) {
							result = 0;
						}						
					} //k
				}//j
			}//i
			
			// 8방 탐색
			int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
			int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};
			
			for(int row = 1; row <  9; row += 3) {
				for(int col = 1; col < 9; col += 3) {
					
					for(int k = 0; k < 8; k++) {
						int nr = row + dr[k];
						int nc = col + dc[k];
						
						if(arr[row][col] == arr[nr][nc]) {
							result = 0;
						}
					}
					
					
				}
			}
			
			System.out.println("#" + test_case + " " + result);
		}	//tc
	}		//main

}
