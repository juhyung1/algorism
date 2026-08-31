package LV3;

import java.util.Scanner;

public class swea1217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("#" + test_case + " " + power(a,b));
			
			
		}

	}
	
	static int power (int a, int b) {
		if (b==0) {
			return 1;
		}
		
		return a * power(a, b - 1);
	}

}
