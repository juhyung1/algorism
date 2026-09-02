package LV3;

import java.util.*;

public class swea8931_제로_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			Stack<Integer> stack = new Stack<>();
			
			int K = sc.nextInt();
			int sum = 0;
			
			for(int i = 0; i < K; i++) {
				int num = sc.nextInt();
				if(num == 0) {
					stack.pop();
				}
				else {
					stack.push(num);
				}
			}	// for-K
			
			int size = stack.size();
			
			while(size > 0) {
				sum += stack.get(size-1);
				size--;
			}
			System.out.println("#" + tc + " " + sum);		
		}	// tc
	}		// main
}
