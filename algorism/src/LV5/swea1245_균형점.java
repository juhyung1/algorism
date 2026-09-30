package LV5;

import java.util.Scanner;

public class swea1245_균형점 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			double[] x = new double[N];
			double[] weight = new double[N];
			
			for(int i = 0; i < N; i++) { // 좌표
				x[i] = sc.nextDouble();
			}
			
			for(int i = 0; i < N; i++) { // 질량
				weight[i] = sc.nextDouble();
			}
			
			for(int i = 0; i < N-1; i++) { // 오름차순 정렬하기
				int idx = i;
				for(int j = i+1; j < N; j++) {
					if(x[j] < x[idx]) {
						idx = j;
					}
				}
				
				double temp1 = x[i];
				x[i] = x[idx];
				x[idx] = temp1;
				
				double temp2 = weight[i];
				weight[i] = weight[idx];
				weight[idx] = temp2;
			}
			
			System.out.print("#" + tc);
			
			for(int i = 0; i < N-1; i++) {
				double left = x[i];
				double right = x[i+1];
				
				while(right - left > 1e-12) {
					double mid = (left + right) / 2.0;
					if(mid == left || mid == right) {
						break;
					}
					
					double lForce = 0;
					double rForce = 0;
					
					for(int j = 0; j <= i; j++) {
						double dist = mid - x[j];
						
						lForce += weight[j] / (dist*dist);
					}
					
					for(int j = i+1; j < N; j++) {
						double dist = x[j] - mid;
						
						rForce += weight[j] / (dist*dist);
					}
					if(lForce > rForce) {
						left = mid;
					}
					else if(lForce < rForce) {
						right = mid;
					}
					else {	// 양쪽 힘 같을 때
						left = mid;
						right = mid;
						break;
					}
					
					
				}	// while
				double answer = (left + right) / 2.0;
				System.out.printf(" %.10f", answer);
			}
			
			System.out.println();
			
		}	// tc
	}		// main


}
