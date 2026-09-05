package LV3;

import java.util.LinkedList;
import java.util.Scanner;

public class swea1230_암호문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			LinkedList<Integer> queue = new LinkedList<>();
			StringBuilder sb = new StringBuilder();
			
			int N = sc.nextInt();
			for(int i = 0; i < N; i++) {
				queue.offer(sc.nextInt());
			}
			
			int M = sc.nextInt();
			for(int i = 0; i < M; i++) {
				char ch = sc.next().charAt(0);
				
				switch(ch) {
				case 'I':
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int k = 0; k < y; k++) {
						queue.add(x + k, sc.nextInt());
					}					
					break;
				case 'D':
					int a = sc.nextInt();
					int b = sc.nextInt();
					for(int k = 0; k < b; k++) {
						queue.remove(a);
					}				
					break;
				case 'A':
					int q = sc.nextInt();
					for(int k = 0; k < q; k++) {
						queue.offer(sc.nextInt());				
					}					
					break;
					
				}					
			}
			for(int i = 0; i < 10; i++) {
				sb.append(queue.get(i)).append(" ");
			}
			
			System.out.println("#" + tc + " " + sb);
			
			
		}	// tc
	}		// main

}
