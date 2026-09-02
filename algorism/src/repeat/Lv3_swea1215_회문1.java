package repeat;

import java.util.Scanner;

public class Lv3_swea1215_회문1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++) {
			char[][] arr = new char[8][8];			
			
			int size = sc.nextInt();
			
			// string으로 받아서 char 형태로 변환하여 값 넣기
			for(int i = 0; i < 8; i++) {
				String str = sc.next();
				for(int j = 0; j < 8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			
			for(int i = 0; i < 8 - size + 1; i++) {
				for(int j = 0; j < 8 - size + 1; j++) {
					
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}	//tc
	}		//main
}
