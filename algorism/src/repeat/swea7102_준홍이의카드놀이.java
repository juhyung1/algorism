package repeat;

import java.util.Scanner;

public class swea7102_준홍이의카드놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] count = new int[N+M+1];
			int max = 0;
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= M; j++) {
					count[i+j]++;
				}
			}
			
			for(int i = 0; i < N+M+1; i++) {
				if(count[i] > max) {
					max = count[i];
				}
			}
			
			for(int i = 0; i < N+M+1; i++) {
				if(count[i] == max) {
					sb.append(i).append(" ");
				}
			}
			
			System.out.println("#" + tc + " " + sb);
		}	// tc
	}		// main
}
