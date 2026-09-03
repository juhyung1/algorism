package LV4;

import java.util.Scanner;

//중위순회(LVR)
public class swea1231_중위순회 {
	
	static char[] tree;
	static int N;
	
	static void inOrder(int index) {
		
		if(index > N) {
			return;
		}
		
		
		inOrder(index * 2);
		System.out.print(tree[index]);
		inOrder(index * 2 + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			N = sc.nextInt();
			sc.nextLine();
			
			tree = new char[N + 1];
			
			for(int i = 1; i <= N; i++) {
				
				String[] str = sc.nextLine().split(" ");
				
				int num = Integer.parseInt(str[0]);
				char ch = str[1].charAt(0);
				
				tree[num] = ch;
			}
			
			System.out.print("#" + tc + " ");
			
			inOrder(1);
			
			System.out.println();
			
			
			
			
			
			
		}	//tc
	}		//main
}
