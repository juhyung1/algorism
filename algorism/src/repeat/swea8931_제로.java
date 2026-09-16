package repeat;

import java.util.Scanner;
import java.util.Stack;

public class swea8931_제로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int K = sc.nextInt();
			
			Stack<Integer> st = new Stack<>();
			
			for(int i = 0; i < K; i++) {
				int num = sc.nextInt();
				if(num == 0) {
					st.pop();
				}
				else st.push(num);
			}
			int sum = 0;
			while(!st.isEmpty()) {
				sum += st.pop();
			}
			
			System.out.print("#" + tc + " " + sum);		
			
		}	// tc
	}		// main
}
