package LV3;

import java.util.Scanner;

public class swea26837_DNA수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int L = sc.nextInt();
			
			char[] arr = new char[L];
			String str = sc.next();
			
			for(int i = 0; i < L; i++) {
				arr[i] = str.charAt(i);
			}
			int count = 0;
			
			
			for(int i = 0; i < L; i++) {
				int at = 0;
				int gc = 0;
				for(int j = i; j < L; j++) {
					switch(arr[j]) {
					case 'A':
						at++;
						break;
					case 'T':
						at--;
						break;
					case 'G':
						gc++;
						break;
					case 'C':
						gc--;
						break;
					}
					if(at == 0 && gc == 0) {
						count++;
					}
				
				}
			}
			
			
			System.out.println("#" + tc + " " + count);
			
			
		}	// tc
	}		// main
}
