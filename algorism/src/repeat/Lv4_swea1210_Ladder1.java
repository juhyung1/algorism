package repeat;

import java.util.Scanner;

public class Lv4_swea1210_Ladder1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			int[][] ladder = new int[100][100];
			
			int row = 99;
			int col = 0;
			
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					ladder[i][j] = sc.nextInt();
					if(ladder[i][j] == 2) {
						col = j;
					}
				}
			}
			
			while(row > 0) {
				
				// 왼쪽 1 검사
				if(col > 0 && ladder[row][col-1] == 1) {
					while(col > 0 && ladder[row][col-1] == 1) {
						col--;
					}
					row--; // 왼쪽으로 이동 다 했으면 위로 1칸 움직이기
				}
				
				// 오른쪽 1 검사
				else if(col < 99 && ladder[row][col+1] == 1) {
					while(col < 99 && ladder[row][col+1] == 1) {
						col++;
					}
					row--; // 오른쪽으로 이동 다 했으면 위로 1칸 움직이기
				}
				else {
					row--;
				}
			}
			System.out.println("#" + test_case + " " + col);
			
		}	//tc
	}		//main
}
