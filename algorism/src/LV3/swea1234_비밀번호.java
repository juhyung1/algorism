package LV3;

import java.util.Scanner;
import java.util.Stack;

public class swea1234_비밀번호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			
			Stack<Character> s = new Stack<>();
			
			int N = sc.nextInt();
			String str = sc.next();
			
			
			for(int i = 0; i < N; i++) {
				char ch = str.charAt(i);
				
				if(!s.isEmpty() && ch == s.peek()) {
					s.pop();
				}
				
				else s.add(ch);				
			}
			
			System.out.print("#" + tc + " ");
			for(char num : s) {
				System.out.print(num);
			}
			System.out.println();
		}	// tc
	}		// main
}
