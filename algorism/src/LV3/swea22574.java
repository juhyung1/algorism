package LV3;

import java.util.Scanner;

public class swea22574 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int choice = sc.nextInt();
			int bomb = sc.nextInt();
			
			int current = 0;
			
			for(int i = 1; i <= choice; i++) {
				current += i;
				if(current == bomb) {
					current--;	// 맨처음에 1층 올라가는걸 포기했다고 생각하기
				}
			}
			
			System.out.println(current);
			
			
			
			
		}	//tc
	}		//main

}
