package LV3;

import java.util.Scanner;

public class swea4406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String word = sc.next();
			char[] wordArr = word.toCharArray();
			int leng = wordArr.length;
			String result = "";
			
			for(int i = 0; i < leng; i++) {
				if(wordArr[i] != 'a' && wordArr[i] != 'e' && wordArr[i] != 'i' &&
						wordArr[i] != 'o' && wordArr[i] != 'u') {
					result += wordArr[i];
				}
				
			}
			System.out.println("#" + " " + result);
			
			
		}// test_case for문
		

	}// main

}
