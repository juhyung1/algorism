package LV1;

import java.util.Scanner;

public class swea1938 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        int minus = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(div);

	}

}
