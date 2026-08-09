package LV3;

import java.util.Arrays;
import java.util.Scanner;

public class swea1208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++) {
			
			int[] arr = new int[100];
			
			int dump = sc.nextInt();
			
			for(int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int i = 0; i < dump; i++) {
				arr[0]++;
				arr[99]--;
				Arrays.sort(arr);
			}
			int result = arr[99] - arr[0];
			
			System.out.println("#" + test_case + " " + result);			
			
		}//tc

	}

}
