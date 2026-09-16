package LV4;

import java.util.Scanner;
import java.util.Stack;

public class swea5432_쇠막대기자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			
			Stack<Character> stack = new Stack<>();
			
			String str = sc.next();
			int result = 0;
			
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				
				if(ch == '(') {
					stack.push(ch);
				}
				
				else {
					stack.pop();
					
					if(str.charAt(i-1) == '(') {
						result += stack.size();
					}
					
					else {
						result ++;
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}	// tc
	}		// main

}
