import java.util.Scanner;

public class 어디에단어가 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] arr = new int[N+2][N+2];
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			int result = 0;
			
			for(int i = 1; i <= N; i++) {
				int count1 = 0;
				int count2 = 0;
				for(int j = 1; j <= N; j++) {
					
					if(arr[i][j] == 1) {
						count1++;
						if(count1 == K && arr[i][j+1] == 0) {
							result++;
							count1 = 0;
						}
					}
					else if(arr[i][j] == 0) {
						count1 = 0;
					}
					
					if(arr[j][i] == 1) {
						count2++;
						if(count2 == K && arr[j+1][i] == 0) {
							result++;
							count2 = 0;
						}
					}
					
					else if(arr[j][i] == 0) {
						count2 = 0;
					}


				}


			}
			System.out.println("#" + tc + " " + result);
		}	// tc
	}		// main
}
