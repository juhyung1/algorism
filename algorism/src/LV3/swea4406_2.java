package LV3;

import java.util.Scanner;

public class swea4406_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String word = sc.next();
			char[] wordArr = word.toCharArray();
			int leng = wordArr.length;
			
			for(int i = 0; i < leng-1; i++) {
				if(wordArr[i] == 'a' || wordArr[i] == 'e' || wordArr[i] == 'i' ||
						wordArr[i] == 'o' || wordArr[i] == 'u') {
					for(int j = i; j < leng-1; j++) {
						wordArr[j] = wordArr[j+1];
					}
					leng--;
					i--;
				
				}
			}
			System.out.print("#" + test_case + " ");
			for(int a = 0; a < leng; a++) {
				System.out.print(wordArr[a]);
			}
			System.out.println();
			
			
		}// test_case for문
		

	}// main

}
