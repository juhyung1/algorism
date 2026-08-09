package LV2;

import java.util.*;

public class swea1986 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		
		for(int TEST_CASE = 1; TEST_CASE <= T; TEST_CASE++) {
			int Num = sc.nextInt();
			int result = 0;

			if(Num % 2 == 0) {
				result = (Num / 2) * (-1);
			}
			else {
				result = (Num / 2) + 1;
			}
			
			System.out.println("#" + TEST_CASE + " " + result);		
			
			
		}sc.close();
		
		
	}
}
