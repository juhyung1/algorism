package LV2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea1204 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input.txt"));

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int[] right = new int[101]; // 0점~100점 카운트세기
			int Max = 0;
			int result = 0; // 최빈수 점수
			
			int num = sc.nextInt();
			
			for(int i = 0; i < 1000; i++) {
				int score = sc.nextInt();
				right[score]++;
			}
			
			for(int i = 0; i <= 100; i++) {
				if(right[i] >= Max) {
					Max = right[i];
					result = i;
					
				}
			}			  
			
			System.out.println("#" + test_case + " " + result);
						
			
		}
		
		
		
		
		
	}

}
