/*queue를 안썼지만 queue를 사용해서 풀면
2중 for문을 돌면서 두 수의 합을 queue에 다 넣음
queue에서 하나씩 빼면서 그 합의 값을 카운팅함*/

package LV3;

import java.util.Scanner;

public class swea7102_준홍이의카드놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			
			int[] arr = new int[N+M+1];
			
			StringBuilder sb = new StringBuilder();
			
			int max = 0;
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= M; j++) {
					arr[i+j]++; 
					max = Math.max(max, arr[i+j]);
				}
			}
			
			for(int i = 2; i <= N+M; i++) {
				if(max == arr[i]) {
					sb.append(i + " ");
				}
			}
			
			
			System.out.println("#" + tc + " " + sb);
			
		}	// tc
	}		// main
}
