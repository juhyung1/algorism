package LV4;

import java.util.*;

public class swea1218_괄호짝짓기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int num = sc.nextInt();
			String str = sc.next();
			int result = 1; // 짝이 맞는다고 가정하고 시작

			if (num % 2 == 1) { // 괄호의 개수가 홀수라면 굳이 stack을 돌 필요가 없다
				result = 0;
			}

			else {	// 괄호의 개수가 짝수일 때
				Stack<Character> stack = new Stack<>();

				for (int i = 0; i < num; i++) {
					char ch = str.charAt(i);
					
					// 여는 괄호
					if(ch == '(' || ch == '{' || ch == '[' || ch == '<') {
						stack.push(ch);
					}
										
					// 닫는 괄호
					else {
						if(stack.isEmpty()) {
							result = 0;
							break;
						}						
						// 정상적으로 닫혀있을 때
						if (stack.peek() == '(' && ch == ')') {
							stack.pop();
						}
						else if (stack.peek() == '{' && ch == '}') {
							stack.pop();
						}
						else if (stack.peek() == '<' && ch == '>') {
							stack.pop();
						}
						else if (stack.peek() == '[' && ch == ']') {
							stack.pop();
						}
						
						// 짝이 안맞을 때
						else {
							result = 0;
							break;
						}					
					}
				} // for-num
				
				// 다 검사했는데 여는 괄호가 남아있을 때
				if(!stack.isEmpty()) {
					result = 0;
				}
			}	// 전체 else(짝수일 때)
			System.out.println("#" + tc + " " + result);
		} // tc
	} // main
}
