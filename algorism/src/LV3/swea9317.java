package LV3;

import java.util.Scanner;

public class swea9317 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int large = sc.nextInt();
			
			String letter = sc.next();
			String suk = sc.next();
			
			int right = 0;
			
			char[] charletter = letter.toCharArray();
			char[] charsuk = suk.toCharArray();
			
			for(int i = 0; i < charletter.length; i++) {
				if(charletter[i] == charsuk[i]) {
					right += 1;
				}
			}
			
			System.out.println("#" + test_case + " " + right);			
			
			
			
			
			
		}
		
		
		
		
	}

}
