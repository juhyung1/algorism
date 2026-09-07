import java.util.Scanner;

public class 햄버거다이어트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int L = sc.nextInt();
			
			int[] score = new int[N];
			int[] cal = new int[N];
			
			for(int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
				cal[i]= sc.nextInt();
			}
			int max = 0;
			for(int i = 0; i < (1<<N); i++) {
				int sumScore = 0;
				int sumCal = 0;
				for(int j = 0; j < N; j++) {
					
					if( (i & (1<<j)) != 0) {
						sumScore += score[j];
						sumCal += cal[j];
					}				
				}
				
				if(sumCal <= L) {
					max = Math.max(max, sumScore);
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}	// tc
	}		// main
}
