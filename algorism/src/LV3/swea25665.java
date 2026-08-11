package LV3;

import java.util.Scanner;

public class swea25665 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int num = sc.nextInt();
			String str = "";
			
			int div = num / 2;
			
			if(num == 1) {
				str = "0";
			}
			else {
			if(num % 2 != 0) {
				str += "4";
			}
			
			for(int i = 0; i < div; i++) {
				str += "8";
			}
			}
			
			
			
			System.out.println(str);
			
		}	//tc
	}		//main

}
