package LV3;

import java.util.Scanner;

public class swea14692_통나무자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			String str = (num % 2 == 0) ? "Alice" : "Bob";
			System.out.println("#" + tc + " " + str);
		}

	}

}
