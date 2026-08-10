package LV2;

import java.util.Scanner;

public class swea1948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			int month2 = sc.nextInt();
			int day2 = sc.nextInt();
			
			int date1 = 0;
			int date2 = 0;
			
			for(int i = 1; i < month1; i++) {
				switch(i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					date1 += 31;
					break;
				case 2:
					date1 += 28;
					break;
				case 4: case 6: case 9: case 11:
					date1 += 30;
					break;
				}
			}
			date1 += day1;
			
			for(int i = 1; i < month2; i++) {
				switch(i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					date2 += 31;
					break;
				case 2:
					date2 += 28;
					break;
				case 4: case 6: case 9: case 11:
					date2 += 30;
					break;
				}
			}
			date2 += day2;
			int total = date2 - date1 + 1;
			System.out.println("#" + test_case + " " + total);
			
			
		}	// tc
	}		// main
}
