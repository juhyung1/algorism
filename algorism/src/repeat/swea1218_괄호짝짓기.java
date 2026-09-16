package repeat;

import java.util.Scanner;
import java.util.Stack;

public class swea1218_괄호짝짓기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			
			Stack<Character> st = new Stack<>();
			
			int result = 1;
			
			String str = sc.next();
			
			if(N % 2 != 0) { // 입력값이 홀수면 바로 실패
				result = 0;
			}
			
			else {	// 입력값이 짝수일 때
				for(int i = 0; i < N; i++) {
					char ch = str.charAt(i);
					
					// 여는 괄호
					if(ch == '(' || ch == '<' || ch == '{' || ch == '[') {
						st.push(ch);
					}
					
					// 닫힌 괄호
					else {
						if(st.isEmpty()) { // 닫는괄호가 나왔는데 스택이 비어있다면?
							result = 0;
							break;
						}
						// 정상적으로 닫힐때
						if(st.peek() == '(' && ch == ')') {
							st.pop();
						}
						else if(st.peek() == '<' && ch == '>') {
							st.pop();
						}
						else if(st.peek() == '[' && ch == ']') {
							st.pop();
						}
						else if(st.peek() == '{' && ch == '}') {
							st.pop();
						}
						
						// 짝이 안맞는다면?
						else {
							result = 0;
							break;
						}
						
					}
					
				}	// 큰 for문
				// 다 검사했는데 괄호가 남아있다면?
				if(!st.isEmpty()) {
					result = 0;
				}
				
			}	// 전체 큰 else문			
			System.out.println("#" + tc + " " + result);				
		}	// tc
	}		// main

}
