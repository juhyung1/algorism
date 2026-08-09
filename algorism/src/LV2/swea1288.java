package LV2;
import java.util.*;

public class swea1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int num = sc.nextInt();
			int[] arr = new int[10];
			int count = 1;
			
			while(true) {
				
				int mul = num * count;
				int copy = mul;
				
				while(copy > 0) {
					arr[copy % 10]++;
					copy /= 10;
				}
				
				boolean isOk = true;
				
				for(int i = 0; i < 10; i++) {
					if(arr[i] == 0) {
						isOk = false;
						break;
					}
				}
				
				if(isOk) {
					System.out.println("#" + test_case + " " + mul);
					break;
				}
				
				count++;			

			}

		}
		
		
	}

}
