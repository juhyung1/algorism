package IM준비;

import java.util.Scanner;

public class swea11315_오목판정 {
	static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			char[][] charArr = new char[N+2][N+2];
			int[][] intArr = new int[N+2][N+2];
			
			for(int i = 0; i < N; i++) {	
				String str = sc.next();
				for(int j = 0; j < N; j++) {
					charArr[i][j] = str.charAt(j); 
					if(charArr[i][j] == 'o' ) {
						intArr[i][j] = 1;
					}
				}
			}
			
			boolean isOk = false;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(intArr[i][j] == 0) continue;		
					
					
					for(int a = 0; a < 8; a++) {
						int count = 1;
						for(int b = 1; b < 5; b++) {
							int nr = i + dr[a] * b;
							int nc = j + dc[a] * b;
							
							if(nr >= 0 && nc >= 0 && nr < N && nc < N)  {
								
							if(intArr[nr][nc] == 1) {
								count++;
							}
								else {
									break;
								}
							}
							
							if(count == 5) {
								isOk = true;
								break;
						}
						}
						if(isOk) {
							break;
						}
					}	
					if(isOk) {
						break;
					}
					
				}
			}
			
			
			if(isOk) {
				System.out.println("#" + tc + " YES");
			}
			else {
				System.out.println("#" + tc + " NO");				
			}
			
			
			
		}	// tc
	}		// main

}
