package algorism;

import java.util.Scanner;

public class swea1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			
			int big = (first>=second) ? first : second;
			
			int num = Math.abs(first-second) + 1; // 순회 횟수
			
			int max = Integer.MIN_VALUE; // 최댓값
			
			
			int[] arr1 = new int[first];
			int[] arr2 = new int[second];
			
			for(int i = 0; i < first; i++) {
				arr1[i] = sc.nextInt();
			}
			
			for(int j = 0; j < second; j++) {
				arr2[j] = sc.nextInt();
			}
			
			if(first >= second) {
				for(int i = 0; i < num; i++) {
					int result = 0;
					for(int j = 0; j < second; j++) {
						result += arr1[j+i]*arr2[j];
					}
					if(result > max) {
						max = result;
					}
				}
			}// if
			
			else {
				for(int i = 0; i < num; i++) {
					int result = 0;
					for(int j = 0; j < first; j++) {
						result += arr1[j] * arr2[j+i];
					}
					if(result > max) {
						max = result;
					}
				}			
			} // else
			
			System.out.println("#" + test_case + " " + max);

	} // tx

}
}
