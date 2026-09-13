package LV3;

import java.util.Scanner;

public class swea5215_햄버거다이어트 {
	
	static int totalCal; // 전체 칼로리
	static int N;		// 재료 개수
	
	static int[] score;	// 각 재료의 점수
	static int[] cal;	// 각 재료의 칼로리
	
	static int maxScore; // 최대 점수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			totalCal = sc.nextInt();
			
			score = new int[N];
			cal = new int[N];
			
			for(int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}			
					
			maxScore = 0;
			
			// 확인할 재료의 번호, 점수의 합, 칼로리 합
			dfs(0, 0, 0);
			
			System.out.println("#" + tc + " " + maxScore);
			
		}	// tc
	}		// main
	
	static void dfs(int index, int sumScore, int sumCal) {
		if(sumCal > totalCal) { // 현재 칼로리가 최대 칼로리가 넘어갔다면 끝
			return;
		}		
		
		if(index == N) {	// 모든 재료 확인했다면
			maxScore = Math.max(sumScore, maxScore);
			return;
		}
		
		// 현재 재료 선택, 다음 재료 이동, 현재 재료 점수 추가, 칼로리 추가
		dfs(index + 1, sumScore + score[index], sumCal + cal[index]);
		
		// 현재 재료 선택x, 다음재료 이동, 점수 칼로리 유지
		dfs(index + 1, sumScore, sumCal);				
		
	}	
}
