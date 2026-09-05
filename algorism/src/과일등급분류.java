import java.util.Arrays;
import java.util.Scanner;

public class 과일등급분류 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int lo = sc.nextInt();
			int hi = sc.nextInt();
			
			int[] weight = new int[N];
			
			for(int i = 0; i < N; i++) {
				weight[i] = sc.nextInt();
			}
			Arrays.sort(weight);
			
			int result = Integer.MAX_VALUE;
			
			// 하등급 : 0 ~ k1-1
			// 중등급 : k1 ~ k2-1
			// 상등급 : k2 ~ N-1			
			for(int k1 = 1; k1 <= N - 2; k1++) {
				// 같은 무게의 과일을 다른 등급으로 나누지 않게 하기 위함
				if (weight[k1 - 1] == weight[k1]) {
					continue;
				}
				for(int k2 = k1 + 1; k2 <= N-1; k2++) {
					// 같은 무게의 과일을 다른 등급으로 나누지 않게 하기 위함
					if (weight[k2 - 1] == weight[k2]) {
						continue;
					}
					
					int a = N - k2;		// 상
					int b = k2 - k1;	// 중
					int c = k1;			// 하
					
					if(a < lo || a > hi) continue;
					if(b < lo || b > hi) continue;
					if(c < lo || c > hi) continue;
					
					int max = Math.max(a, Math.max(b, c));
					int min = Math.min(a, Math.min(b, c));
					
					result = Math.min(result, max-min);					
				}
			}			
			if(result == Integer.MAX_VALUE) {
				result = -1;
			}			
			System.out.println("#" + tc + " " + result);
		}	// tc
	}		// main
}
