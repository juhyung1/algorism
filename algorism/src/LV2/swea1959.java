package LV2;

import java.util.Scanner;

public class swea1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int[] arrA = new int[A];
			int[] arrB = new int[B];
			
			for(int i = 0; i < arrA.length; i++) {
				arrA[i] = sc.nextInt();
			}
			for(int i = 0; i < arrB.length; i++) {
				arrB[i] = sc.nextInt();
			}
			
			
			int size = Math.abs(A-B) + 1;
			
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i < size; i++) {
				int result = 0;
				
				if(A < B) {
					for(int j = 0; j < A; j++) {
						result += arrA[j]*arrB[j+i];
					}
					if(result > max) {
						max = result;
					}
				}
				
				else {
					for(int j = 0; j < B; j++) {
						result += arrA[j+i]*arrB[j];
					}
					if(result > max) {
						max = result;
					}
					
				}			
				
			} // size for문
			System.out.println("#" + test_case + " " + max);
			
			
		}//tc
		
	}//main

}
