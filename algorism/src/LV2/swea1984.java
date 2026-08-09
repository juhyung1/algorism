package LV2;

import java.util.Arrays;
import java.util.Scanner;

public class swea1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {

			int[] arr = new int[10];
			int sum = 0;
			
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int i = 1; i < arr.length-1; i++) {
				sum += arr[i];
			}
			
			int result = (int)Math.round((double)sum / 8);
			
			System.out.println("#" + test_case + " " + result);
			
			
		}

	}

}
