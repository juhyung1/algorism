package LV3;

import java.util.Scanner;

public class swea1208_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int[] arr = new int[100];
			
			int temp = sc.nextInt();
			
			for(int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = 0;
			int maxIdx = 0;
			int min = 101;
			int minIdx = 0;
			
			for(int i = 0; i < temp; i++) {
				
				for(int j = 0; j < 100; j++) {
					if(max < arr[j]) {
						max = arr[j];
						maxIdx = j;
					}
				}
				
				for(int j = 0; j < 100; j++) {
					if(min > arr[j]) {
						min = arr[j];
						minIdx = j;
					}
				}
				if(max - min <= 1) {
					break;
				}
				
				arr[maxIdx] -= 1;
				arr[minIdx] += 1;
				
				
			}
				
			
			
			
		}	//tc
	}		//main

}
