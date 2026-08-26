package LV3;

import java.util.Scanner;

public class swea1213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			
			int tc = sc.nextInt();
			String find = sc.next(); // 찾아야될
			String sentence = sc.next();
			
			char[] newFind = find.toCharArray(); // 찾아야될
			char[] newSentence = sentence.toCharArray();
			
			int fSize = newFind.length;	// 찾아야될 문자열 길이
			int sSize = newSentence.length;	// 총 문자열 길이
			
			int idx = 0;	// 찾아야될 문자열 인덱스
			int count = 0;	
			
			for(int i = 0; i < sSize; i++) {
				
				if(newSentence[i] == newFind[idx]) { // 글자가 같을 때
					idx++;
					
					if(idx == fSize) {
						idx = 0;
						count++;
					}				
				}
				
				else {	// 글자가 다를 때
					i = i - idx;
					idx = 0;
				}				
			}
			
			System.out.println("#" + tc + " " + count);
			
		}	//tc
	}		//main
}
