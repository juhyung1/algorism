package LV2;

import java.util.Arrays;
import java.util.Scanner;

public class swea1983 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		String[] arr = {"D0", "C-", "C0", "C+", "B-", "B0", "B+",
			"A-", "A0", "A+"};
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int student = sc.nextInt();
			int k = sc.nextInt();		// k번째 학생
			int same = student / 10; 	// same 수 만큼 학생들에게 동일한평점
			int index = 0;
			
			double[] score = new double[student + 1];
			
			for(int i = 0; i < student; i++) {
				int score1 = sc.nextInt();
				int score2 = sc.nextInt();
				int score3 = sc.nextInt();
				
				score[i+1] = (double) (score1*0.35) + (score2*0.45) + (score3*0.2); // 총점
			}
			
			double kScore = score[k];	// k번째 학생 점수
			
			Arrays.sort(score);	// 오름차순
			
			for(int i = 1; i <= student; i++) {
				if(kScore == score[i]) {	// k번째 학생 점수의 새로운(정렬 후) 인덱스값 구하기
					index = i;
				}
			}
			index = (int) Math.ceil((double) index / same);
//			index = (index + same-1) / same;   올림 몰라서 이렇게 함...
//			Math.ceil() -> 올림
//			Math.floor() -> 내림
//			Math.round() -> 반올림
			System.out.println("#" + test_case + " " + arr[index-1]);
			
			
		}	// tc
	}		// main
}
