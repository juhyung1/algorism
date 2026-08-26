package LV3;

import java.util.Scanner;

public class swea1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) { // tc 10개 고정
			int size = sc.nextInt();		// 배열 크기
			int[] arr = new int[size];		// 배열 설정
				
			for(int i = 0; i < size; i++) {	// 배열 입력
				arr[i] = sc.nextInt();
			}			
			
			int result = 0;
			
			for(int i = 2; i <= size-3; i++) {
				int min = Integer.MAX_VALUE;
				if(arr[i] > arr[i-2] && arr[i] > arr[i-1] &&
						arr[i] > arr[i+1] && arr[i] > arr[i+2]) { // 해당 인덱스 값이 가장 클 때
					
					// 값을 각각 비교
					if( (arr[i] - arr[i-2]) < min) min = arr[i] - arr[i-2];
					if( (arr[i] - arr[i-1]) < min) min = arr[i] - arr[i-1];
					if( (arr[i] - arr[i+1]) < min) min = arr[i] - arr[i+1];
					if( (arr[i] - arr[i+2]) < min) min = arr[i] - arr[i+2];
					
					result += min;						
				}								
			}
				
			System.out.println("#" + test_case + " " + result);
			
			
		}	// tc
	}		// main
}
