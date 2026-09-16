package LV3;

import java.util.Scanner;

public class swea5431_민석이의과제체크 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] arr = new int[N+1];
			
			for(int i = 1; i <= K; i++) {
				arr[sc.nextInt()]++;
			}
			
			System.out.print("#" + tc + " ");
			
			for(int i = 1; i <= N; i++ ) {
				if(arr[i] == 1) continue;
				else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}	// tc
	}		// main
}
