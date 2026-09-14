package IM준비;

import java.util.Scanner;

public class swea1926_간단한369게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int num = i;
			int count = 0;
			
			while(num > 0) {
				int newnum = num % 10;
				if(newnum == 3 || newnum == 6 || newnum == 9) {
					count++;
				}
				num /= 10;
			}
			
			if(count == 0) {
				System.out.print(i);
			}
			else {
				for(int k = 0; k < count; k++) {
					System.out.print("-");
				}
			}
			
			System.out.print(" ");		
			
		}

	}

}
