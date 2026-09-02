package LV3;

import java.util.Scanner;
import java.util.Stack;

public class swea8931_제로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			
			Stack<Integer> stack = new Stack<>();
			
			int sum = 0;
			
			int K = sc.nextInt();
			
			for(int i = 0; i < K; i++) {
				int num = sc.nextInt();
				if(num == 0) {
					stack.pop();
				}
				
				else {
					stack.push(num);
				}
				
			} // for-K
			
			int size = stack.size();
			
			// stack 내용 버리면서 더하기, 다 더하면 stack이 비어있음
			for(int i = 0; i < size; i++) {
				sum += stack.pop();
			}
			
			
			System.out.println("#" + test_case + " " + sum);
			
			
		}	//tc
	}		// main
}
