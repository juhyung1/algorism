package LV3;

import java.util.Scanner;

public class swea25837 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String ar;
			
			long S = sc.nextLong();
			long P = sc.nextLong();
			
			double root = (double) S*S - 4*P;
			
			double S1 = (S + Math.sqrt(root)) / 2;
			double S2 = (S - Math.sqrt(root)) / 2;

			
			
			
			
		}	//tc
	}		//main

}
