import java.util.Scanner;

public class 부분수열의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			
			int[] arr = new int[N];
			
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < (1 <<N); i++) { // i < 16 (2^4)
				int sum = 0;
				for(int j = 0; j < N; j++) {
					if( (i & (1<<j)) != 0) {
						sum += arr[j];
					}
				}
				if(sum == K) {
					count++;
				}
			}
			
			System.out.println("#" + tc + " " + count);
		}	// tc
	}		// main
}
