import java.util.Arrays;
import java.util.Scanner;

public class 일회용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int k_min = sc.nextInt();
			int k_max = sc.nextInt();
			
			int[] score = new int[101];
			
			for(int i = 0; i < num; i++) {
				score[sc.nextInt()]++;
			}
			
			int result = Integer.MAX_VALUE;
			
			for(int t1 = 1; t1 <= 100; t1++) {
				for(int t2 = t1 + 1; t2 <= 100; t2++) {
					
					int a = 0;	// t2 이상, a반에 들어가는 인원
					int b = 0;	// t1 이상 t2 미만, b반에 들어가는 인원
					int c = 0;	// t1 미만, c반에 들어가는 인원
					
					for(int s = 1; s <= 100; s++) {
						if(s < t1) {	// 현재의 점수 s가 t1 보다 낮으면 c반
							c += score[s];
						}
						else if(s < t2) {	// 현재의 점수 s가 t1이상 t2미만이면 b반
							b += score[s];
						}
						else {				// 위 두 조건 만족x -> 현재의 점수 s가 t2이상이면 a반
							a += score[s];
						}
					}
					
					// 각 반의 인원이 최소와 최대 사이값이 아니면 다음 for문으로
					if(a < k_min || a > k_max) continue;
					if(b < k_min || b > k_max) continue;
					if(c < k_min || c > k_max) continue;
					
					
					int max = Math.max(a, Math.max(b, c));	// 세 반 중 최대 인원
					int min = Math.min(a, Math.min(b, c));	// 세 반 중 최소 인원
					
								
					result = Math.min(result, max-min);
					
					
				}	//t1
			}		//t2
			
			// 끝까지 조건을 만족하는 T1, T2를 하나도 찾지 못했다면
			// 10명, 최소4, 최대5 일때 만족하지 않음
			// 4 + 4 + 4 = 12
			if(result == Integer.MAX_VALUE) {
				result = -1;
			}			

			
			System.out.println("#" + tc + " " + result);
		}	// tc
	}		// main
}
