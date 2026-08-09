package LV2;

import java.util.Scanner;

public class swea1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int size = sc.nextInt();
			String[] alphabet = new String[size];
			int[] num = new int[size];
			
			int count = 0;
			
			for(int i = 0; i < size; i++) {
				alphabet[i] = sc.next();
				num[i] = sc.nextInt();
			}
			
			System.out.println("#" + test_case);
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < num[i]; j++) {
					System.out.print(alphabet[i]);
					count++;
					if(count == 10) {
						System.out.println();
						count = 0;
					}
				}
			}
			if(count != 0) {
				System.out.println();
			}		
			
		}
	}
}
