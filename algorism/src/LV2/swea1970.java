package LV2;

import java.util.Scanner;

public class swea1970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			int[] count = new int[8];
			
			int money = sc.nextInt();
			
			for(int i = 0; i < arr.length; i++) {
				count[i] = money / arr[i];
				money = money % arr[i];				
			}
			
			System.out.println("#" + test_case);
			for(int i = 0; i < arr.length; i++) {
				System.out.print(count[i] + " ");
			}
			System.out.println();
					
			
		}	//tc
	}		//main

}
