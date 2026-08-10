package LV2;

import java.util.Scanner;

public class swea2001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int size = sc.nextInt(); // 배열 크기
			int[][] arr = new int [size][size];
			int M = sc.nextInt(); // 파리채 크기
			
			for(int i = 0; i < size; i++) { 	// 배열 입력
				for(int j = 0; j < size; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int row = 0;
			int col = 0;

			int max = 0;
			
			
			for(int i = 0; i < size-M+1; i++) {  
				for(int j = 0; j < size-M+1; j++) {
				
				int sum = 0;
				for(int x = 0; x < M; x++) {
					for(int y = 0; y < M; y++) {
							sum += arr[x+i][y+j];						
					}
				}
				if(sum > max) {
					max = sum;
				}
			}
			}
			System.out.println("#" + test_case + " " + max);
			

			
			
		}	//tc

	}		//main

}
