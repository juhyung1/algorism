package LV2;

import java.util.Scanner;

public class swea14510_나무높이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();	// 나무 개수
			int[] tree = new int[N];	// 각각의 나무 높이 배열
			
			int max = 0;
			for(int i = 0; i < N; i++) {
				tree[i] = sc.nextInt();
				
				max = Math.max(max, tree[i]);
			}
			
			int one = 0;	// 홀수 날짜의 +1 물주기 필요한 횟수
			int two = 0;	// 짝수 날짜의 +2 물주기 필요한 횟수
			
			for(int i = 0; i < N; i++) {
				int minus = max - tree[i];	// 현재 나무가 최고높이까지 얼마나 자라야하는지
				
				one += minus % 2;
				two += minus / 2;
			}
			int day = 0;	// 0일부터 시작
			
			while(true) {
				// day일까지 존재하는 홀수 날짜의 개수
				// 5라면 홀수 날짜는 1일, 3일, 5일 총 3개
				int oneday = (day + 1) / 2;
				
				// day일까지 존재하는 짝수 날짜의 개수
				// 5라면 홀수 날짜는 2일, 4일 총 2개
				int twoday = day / 2;
				
				/*
				 * 필요한 +2 물주기 횟수는 two
				 * 실제로 사용할 수 있는 짝수 날짜수는 twoDay
				 */
				int td = Math.max(0,  two - twoday);
				
				
				if((one + td * 2) <= oneday) {
					break;
				}
				
				day++; // 아직 불가능하면 날짜 하루 증가시키기
			}	// while
			
			
			
			System.out.println("#" + tc + " " + day);
		}		// tc
	}			// main

}
