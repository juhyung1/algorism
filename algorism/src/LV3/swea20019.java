package LV3;

import java.util.Scanner;

public class swea20019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String word = sc.next();
			
			char[] changeWord = word.toCharArray();
			
			int size = changeWord.length;
			
			String YN = "YES";
			
			
			for(int i = 0; i < size; i++) {	// 전체 회문인지 확인
				if(changeWord[i] != changeWord[size - 1 - i]) {
					YN = "NO";
				}
			}
			
			
			int N = (size-1) / 2;
			
			for(int i = 0; i < N; i++) {		// 앞 N글자 회문 확인
				if(changeWord[i] != changeWord[N - 1 - i]) {
					YN = "NO";
				}
			}
			
			
			for(int i = size - N; i < size; i++) {		// 뒤 N글자 회문 확인
				if(changeWord[i] != changeWord[size + N - i]) {
					YN = "NO";
				}
			}
			System.out.println("#" + test_case + " " + YN);

			
		}	// tc
	}		// main
}
