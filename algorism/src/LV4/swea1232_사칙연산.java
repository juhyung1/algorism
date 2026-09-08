package LV4;

import java.util.Scanner;

import org.w3c.dom.Node;

public class swea1232_사칙연산 {
	static Node[] tree;
	
	static class Node {
		String cal;
		int left;
		int right;
		
		public Node(String cal) {
			this.cal = cal;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			tree = new Node[N + 1]; // 인덱스를 1부터 사용하기 위함
			
			for(int i = 0; i < N; i++) {
				int num = sc.nextInt();
				String cal = sc.next();
				
			tree[num] = new Node(cal);
			
			if(cal.equals("+") || cal.equals("-") ||
					cal.equals("*") || cal.equals("/")) {
				tree[num].left = sc.nextInt();
				tree[num].right = sc.nextInt();
			}
		}
			
			int result = (int) calculate(1);
			
			System.out.println("#" + tc + " " + result);
			
			
		}	// tc
	}		// main
	
	
	static double calculate(int num) {
		Node node = tree[num];
		
		// 숫자 정점일때
		if(!node.cal.equals("+") && !node.cal.equals("-")
				&& !node.cal.equals("*") && !node.cal.equals("/")) {
			return Double.parseDouble(node.cal);
		}
		
		double leftCal = calculate(node.left);
		double rightCal = calculate(node.right);
		
		
		switch(node.cal) {
		case "+":
			return leftCal + rightCal;

		case "-":
			return leftCal - rightCal;

		case "*":
			return leftCal * rightCal;

		case "/":
			return leftCal / rightCal;
			
		}		
		return 0;		
	}
	
}
