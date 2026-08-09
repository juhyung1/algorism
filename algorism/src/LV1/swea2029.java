package LV1;
import java.util.*;

public class swea2029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int div = num1 / num2;
			int leftover = num1 % num2;
			
			System.out.println("#" + test_case + " " + div + " " + leftover);
			
			
		}
		
	}

}
