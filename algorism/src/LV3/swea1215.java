package LV3;

import java.util.Scanner;

public class swea1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			char[][] arr = new char[8][8];
			int leng = sc.nextInt(); // 회문의 길이

			for (int i = 0; i < 8; i++) { // 띄어쓰기가 없기 때문에 string으로 받고 char로 변환
				String str = sc.next();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			int count = 0;

			// 열 검사
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8 - leng; j++) {
					boolean isOk = true;

					for (int k = 0; k < leng / 2; k++) {
						if (arr[i][j + k] != arr[i][j + leng - 1 - k]) {
							isOk = false;
							break;
						}
						
					}
					if (isOk) {
						count++;
					}

				}
			}

			// 행 검사
			for (int i = 0; i <=  8 - leng; i++) {
				for (int j = 0; j < 8; j++) {
					boolean isOk = true;

					for (int k = 0; k < leng / 2; k++) {
						if (arr[i + k][j] != arr[i + leng - 1 - k][j]) {
							isOk = false;
							break;
						}
					}
					if (isOk) {
						count++;
					}

				}
			}
			
			System.out.println("#" + test_case + " " + count);

		} // tc
	} // main
}
