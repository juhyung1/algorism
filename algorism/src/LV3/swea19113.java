package LV3;

import java.util.Arrays;
import java.util.Scanner;

public class swea19113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			
			int[] arr = new int[N*2];	// 상품할인가격, 원가 오름차순
			int[] result = new int[N*2];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < arr.length; i++) {
				
//				if(arr[i] == -1) {
//					continue;
//				}
				
				for(int j = i + 1; j < arr.length; j++) {
					
//					if(arr[j] == -1) {
//						continue;
//					}
					
					
					if(( (long) arr[i]*4/3) == arr[j]) {
						result[i] = arr[i];
						
						arr[i] = -1;
						arr[j] = -1;
//						break;
					}
				}
			}
			
			System.out.print("#" + test_case + " ");
			Arrays.sort(result);
			for(int i = 0; i < result.length; i++) {
				if(result[i] > 0) {
					System.out.print(result[i] + " ");
				}
			}
			System.out.println();
			
			
			
			
			
		}	//tc
	}		//main

}
