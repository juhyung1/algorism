package LV3;

import java.util.Scanner;

public class swea1213_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			
			String find = sc.next();
			String sentence = sc.next();
			
			int fSize = find.length();
			int sSize = sentence.length();
			
			int count = 0;
			
			for(int i = 0; i <= sSize - fSize; i++ ) {
				if(sentence.substring(i, i + fSize).equals(find)) {
					count++;
				}
			}
			System.out.println("#" + tc + " " + count);
			
		}	//tc
	}		//main
}
