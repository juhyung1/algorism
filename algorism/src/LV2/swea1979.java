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
			
			int result = 0;
			
			for(int i = 0; i < N; i++) { // N*N 배열에 값 입력
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			for(int i = 0; i < N; i++) { 
				int count = 0;
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == 1) { // 1일때 count
						count++;						
					}
					else { // 0일 때
						if(count == K) { // 0을 만나고 count 와 K가 같을때 전체 결과 +1
							result++;
						}
						count = 0;
						
					}
				}
				if(count == K) { // 마지막이 1일 때 검사
					result++;
				}
			}
			
			for(int j = 0; j < N; j++) { 
				int count = 0;
				for(int i = 0; i < N; i++) {
					if(arr[i][j] == 1) { // 1일때 count
						count++;						
					}
					else { // 1이 아닐 때(0일 때)
						if(count == K) { // 0을 만나고 count 와 K가 같을때 전체 결과 +1
							result++;
						}
						count = 0;
						
					}
				}
				if(count == K) { // 마지막이 1일 때 검사
					result++;
				}
			}			
			System.out.println("#" + test_case + " " + result);
			
		}//tc
	}//main

}
