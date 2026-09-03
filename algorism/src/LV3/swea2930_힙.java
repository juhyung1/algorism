package LV3;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class swea2930_힙 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			// 큰값을 우선순위로 결정하기 위해 Collections.reverseOrder() 
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < N; i++) {
				int cal = sc.nextInt();
				
				if(cal == 1) {	// 1일때 값 넣기
					int num = sc.nextInt();
					pq.offer(num);
				}
				else {	// 2일때
					if(pq.isEmpty()) {	// 비어있으면 -1
						sb.append(-1).append(" ");
					} else {			// 안비어있으면 최댓값 삭제 및 반환
						sb.append(pq.poll()).append(" ");
					}
				}
			}
			
			System.out.println("#" + tc + " " + sb);
		}	// tc
	}		// main
}
