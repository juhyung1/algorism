package LV3;

import java.util.Scanner;

public class swea1216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			
			int tc = sc.nextInt();
			char[][] arr = new char[100][100];
			
			
			for(int i = 0; i < 100; i++) { // String -> char
				String str = sc.next();
				for(int j = 0; j < 100; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			boolean check = false;
			int max = 0;
			
			// 열 검사			
			for(int leng = 100; leng >= 1; leng--) {
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j <= 100 - leng; j++) {
						boolean isOk = true;

						for (int k = 0; k < leng / 2; k++) {
							if (arr[i][j + k] != arr[i][j + leng - 1 - k]) {
								isOk = false;
								break;
							}
									
						}					
						if (isOk) {
							max = leng;
							check = true;
							break;
						}
					}
					if (check) {
						break;
					}
				}
				if (check) {
					break;
				}
			}
			check = false;
			// 행 검사
			for(int leng = 100; leng >= 1; leng--) {
				for (int i = 0; i <= 100 - leng; i++) {
					for (int j = 0; j < 100; j++) {
						boolean isOk = true;

						for (int k = 0; k < leng / 2; k++) {
							if (arr[i + k][j] != arr[i + leng - 1 - k][j]) {
								isOk = false;
								break;
							}
									
						}
					
						if (isOk) {
							max = Math.max(max, leng);
							check = true;
							break;
						}
					}
					if (check) {
						break;
					}
				}
				if (check) {
					break;
				}
			}
			System.out.println("#" + tc + " " + max);
		}	//tc
	} // main
}
