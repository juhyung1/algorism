package LV2;

import java.util.Scanner;

public class swea1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int num = sc.nextInt();
			String[] strArr = new String[num];
			int[] intArr = new int[num];
			int[] count = new int[num];
			for(int i = 0; i < num; i++) {
	
				intArr[i] = i + 1;
				strArr[i] = String.valueOf(intArr[i]);
				}
			for(int i = 0; i < num; i++) {
				
			while(intArr[i] > 0) {
				int newNum = intArr[i] % 10;
				if(newNum == 3 || newNum == 6 || newNum == 9) {
					count[i]++;
				}
				intArr[i] /= 10;
			}
				
				
				
			} // while
		
			for(int i = 0; i < num; i++) {
				
				if(count[i] > 0) {
					
					strArr[i] = "";
					
					for(int j = 0; j < count[i]; j++) {
						
						strArr[i] += "-";
						
					}
				}
			}
			
			
			for(int i = 0; i < num; i++) {
				System.out.print(strArr[i] + " ");
			}

			
	}		//main

}
