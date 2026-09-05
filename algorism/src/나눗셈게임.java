import java.util.Scanner;

public class 나눗셈게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			int[] arr = new int[N];

			
			int sum = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(i == j) {
						continue;
					}
					sum += arr[i] % arr[j];
				}
			}

			
			System.out.println("#" + tc + " " + sum);
		}	//tc
	}		//main
}
