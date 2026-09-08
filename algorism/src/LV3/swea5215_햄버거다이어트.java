package LV3;

import java.util.Scanner;

public class swea5215_햄버거다이어트 {
	
	static int totalCal;
	static int N;
	
	static int[] score;
	static int[] cal;
	
	static int maxScore;

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
			
			dfs(0, 0, 0);
			
			System.out.println("#" + tc + " " + maxScore);
			
		}	// tc
	}		// main
	
	static void dfs(int index, int sumScore, int sumCal) {
		if(sumCal > totalCal) {
			return;
		}		
		
		if(index == N) {
			maxScore = Math.max(sumScore, maxScore);
			return;
		}
		
		dfs(index + 1, sumScore + score[index], sumCal + cal[index]);
		
		dfs(index + 1, sumScore, sumCal);				
		
	}	
}
