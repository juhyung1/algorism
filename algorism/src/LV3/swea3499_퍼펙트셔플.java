package LV3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea3499_퍼펙트셔플 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int N = sc.nextInt();
			
			Queue<String> first = new LinkedList<>(); 
			Queue<String> second = new LinkedList<>(); 
			
			int size = (N + 1) / 2;
			
			for(int i = 0; i < size; i++) {
				first.offer(sc.next());
			}
			
			for(int i = size; i < N; i++) {
				second.offer(sc.next());
			}
			
			StringBuilder sb = new StringBuilder();
			
			while(!first.isEmpty()) {	// 첫번째 덱이 다 비워질때까지 반복
				sb.append(first.poll()).append(" ");	// 첫 번째 덱하나 꺼내기
				
				if(!second.isEmpty()) {
					sb.append(second.poll()).append(" ");	// 두번째 덱에서 하나 꺼내기
				}
				
			}			
			
			System.out.println("#" + test_case + " " + sb);

			
		}	// tc
	}		// main
}
