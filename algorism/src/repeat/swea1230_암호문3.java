package repeat;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea1230_암호문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();	// 암호문 개수
			
			LinkedList<Integer> q = new LinkedList<>();
			
			for(int i = 0; i < N; i++) {
				q.offer(sc.nextInt());
			}
			
			int M = sc.nextInt(); // 명령어 개수
			
			for(int i = 0; i < M; i++) {
				String str = sc.next();
				
				switch(str) {
				case "I":
					int x = sc.nextInt();
					int y = sc.nextInt();					
					for(int k = 0; k < y; k++) {
						q.add(x + k, sc.nextInt());
					}
					break;
				case "D":
					int a = sc.nextInt();
					int b = sc.nextInt();
					for(int idx = 0; idx < b; idx++) {
						q.remove(a);
					}
					break;
				case "A":
					int count = sc.nextInt();
					for(int aa = 0; aa < count; aa++) {
						q.offer(sc.nextInt());
					}
					break;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 10; i++) {
				sb.append(q.poll()).append(" ");
			}
			
			System.out.println("#" + tc + " " + sb);
			
		}	// tc
	}		// main
}
