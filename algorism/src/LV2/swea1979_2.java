package LV2;

import java.util.Scanner;

public class swea1979_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int N = sc.nextInt(); // 배열 크기
			int K = sc.nextInt(); // K글자
			
			int[][] arr = new int[N+2][N+2];
			int count = 0;
			
			for(int i = 1; i < arr.length - 1; i++) { // 배열에 값 입력
				for(int j = 1; j < arr[0].length - 1; i++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			
			
			
			
			
			
			
			
		}//tc
	}//main

}
