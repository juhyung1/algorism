package LV4;

import java.util.Scanner;

public class swea1210_Ladder1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			int[][] arr = new int[100][100];
			
			int row = 99;
			int col = 0;
			
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
					
					if(arr[i][j] == 2) {
						col = j;	// 2인 좌표 저장
					}
					
				}
			}
			
			
			while(row > 0) { // 맨 윗줄까지 거꾸로 올라가기
				
				// 왼쪽 확인
				if(col > 0 && arr[row][col-1] == 1) {
					while(col > 0 && arr[row][col-1] == 1) {
						col--;
					}
					row--;
				}
				
				// 오른쪽 확인
				else if(col <99 && arr[row][col+1] == 1) {
					while(col < 99 && arr[row][col+1] == 1) {
						col++;
					}
					row--;
				}
				// 양옆에 1이 없으면 그냥 올라가기
				else {
					row--;
				}
			}
			
			
			System.out.println("#" + tc + " " + col);
			
		}	//tc
	}		//main
}
