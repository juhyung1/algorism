package LV2;

import java.util.Scanner;

public class swea1979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int N = sc.nextInt(); // 배열 크기
			int K = sc.nextInt(); // K글자
			
			int[][] arr = new int[N][N];
			int count = 0;
			
			for(int i = 0; i < arr.length; i++) { // N*N 배열에 값 입력
				for(int j = 0; j < arr[0].length; i++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 행열 탐색하면서 합이 N일때(그다음 블럭이 0이면 count++) 
			
			
			
			
			
			
			
		}//tc
	}//main

}
