package LV1;

import java.util.Scanner;

public class swea2043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = Math.abs(num1 - num2) + 1;
		
		System.out.println(result);

	}

}
