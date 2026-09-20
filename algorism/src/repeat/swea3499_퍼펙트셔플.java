package repeat;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea3499_퍼펙트셔플 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			int N = sc.nextInt();
			String[] s = new String[N];
			
			Queue<String> q1 = new LinkedList<>();
			Queue<String> q2 = new LinkedList<>();
		
			for(int i = 0; i < (N+1)/2; i++) {
				q1.offer(sc.next());
			}
			for(int i = 0; i < N/2; i++) {
				q2.offer(sc.next());
			}
			
			
			while(!q1.isEmpty()) {
				 sb.append(q1.poll()).append(" ");
				 if(!q2.isEmpty()) {
					 sb.append(q2.poll()).append(" ");
				 }
			}
			
			System.out.println("#" + tc + " " + sb);		
			
		}	// tc
	}		// main
}
