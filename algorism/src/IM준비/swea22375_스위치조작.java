package IM준비;

import java.util.Scanner;

public class swea22375_스위치조작 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			int[] arr1 = new int[N];
			int[] arr2 = new int[N];
			
			for(int i = 0; i < N; i++) {
				arr1[i] = sc.nextInt();
			}
			for(int i = 0; i < N; i++) {
				arr2[i] = sc.nextInt();
			}
			
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				if(arr1[i] == arr2[i]) continue;
				
				for(int j = i; j < N; j++) {
					arr1[j] = 1 - arr1[j];
				}
				count++;
			}
			
			
			System.out.println("#" + tc + " " + count);
		}

	}

}
