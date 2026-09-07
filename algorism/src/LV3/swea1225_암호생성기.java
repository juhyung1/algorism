package LV3;

import java.util.LinkedList;
import java.util.Scanner;

public class swea1225_암호생성기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			
			LinkedList<Integer> queue = new LinkedList<>();
			
			for(int i = 0; i < 8; i++) {
				queue.offer(sc.nextInt());
			}
			
			int minus = 1;
			
			while(true) {
				int num = queue.poll() - minus;
				
				if(num <= 0) {
					num = 0;
					queue.offer(num);
					break;
				}
				
				queue.offer(num);
				
				minus++;
				
				if(minus > 5) {
					minus = 1;
				}
				
			}		
			
			System.out.print("#" + T + " ");
			while(!queue.isEmpty()) {
				System.out.print(queue.poll() + " ");
			}
			System.out.println();
			
		}	// tc
	}		// main

}
