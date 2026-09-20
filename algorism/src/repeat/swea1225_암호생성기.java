package repeat;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea1225_암호생성기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			Queue<Integer> q = new LinkedList<>();
			for(int i = 0; i < 8; i++) {
				q.offer(sc.nextInt());
			}
			
			int a = 1;
			while(true) {
				int num = q.poll() - a;
				if(num <= 0) { 
					num = 0;
				}
				q.offer(num);
				if(num == 0) break;
				a++;
				if(a > 5) a = 1;
			}
			StringBuilder sb = new StringBuilder();
			while(!q.isEmpty()) {
				sb.append(q.poll()).append(" ");
			}
			System.out.println("#" + tc + " " + sb);
			
		}	// tc
	}		// main
}
