package IM준비;

import java.util.Scanner;

public class swea21936_길이M회문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			char[] ch = new char[N];
			
			String str = sc.next();
			
			for(int i = 0; i < N; i++) {
				ch[i] = str.charAt(i);
			}
			
			boolean isOk = false;
			
			int idx = -1;
			
			for(int i = 0; i <= N-M; i++) {
				for(int j = 0; j < M; j++) {
					if(ch[i+j] == ch[i + M - 1 - j]) {
						isOk = true;	
						idx = i;
					}
					else 
						isOk = false;
				}
				if(isOk) break;
			}
			
			
			System.out.print("#" + tc + " ");
			if(isOk) {
				for(int i = idx; i < idx + M; i++) {
					System.out.print(ch[i]);
				}
			}
			else {
				System.out.print("NONE");
			}
			
			System.out.println();
			
			
			
			
		}	// tc
	}		// main
}
