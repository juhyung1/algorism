package LV3;

import java.util.Scanner;

public class swea1209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			int[][] arr = new int[100][100];	// 배열 100*100 고정
			
			// 배열 입력
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}			
			
			int max = 0;
			
			for(int i = 0; i < 100; i++) {
				int sum = 0;
				for(int j = 0; j < 100; j++) {
					sum += arr[i][j];
				}
				if(sum > max) {
					max = sum;
				}
			}
			
			for(int j = 0; j < 100; j++) {
				int sum = 0;
				for(int i = 0; i < 100; i++) {
					sum += arr[i][j];
				}
				if(sum > max) {
					max = sum;
				}
			}
			
			int sum = 0;
			// 대각선
			for(int i = 0, j = 0; i < 100 && j < 100; i++, j++) {				
				sum += arr[i][j];
			}
			if(sum > max) {
				max = sum;
			}
			
			sum = 0;
			for(int i = 0, j = 99; i < 100 && j >= 0; i++, j--) {
				
				sum += arr[i][j];
			}
			if(sum > max) {
				max = sum;
			}
						
			
			
			System.out.println("#" + tc + " " + max);
		}	// tc
	}		// main

}
