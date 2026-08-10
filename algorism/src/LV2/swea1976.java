package LV2;

import java.util.Scanner;

public class swea1976 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int[] arr = new int[4];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int hour = arr[0] + arr[2];
			int min = arr[1] + arr[3];
			
			if(min >= 60) {
				min %= 60;
				hour++;
			}
			
			if(hour > 12) {
				hour -= 12;
			}
			
			System.out.println("#" + test_case + " " + hour + " " + min);
			
			
			
			
			
		}	// tc

	}		// main

}
