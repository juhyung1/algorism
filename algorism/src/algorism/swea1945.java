package algorism;
import java.util.Scanner;

public class swea1945 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	
		
		
		int[] division = {2,3,5,7,11};
		int[] arr = new int[5];
		
		
		for(int i = 1; i <= T; i++) {
			int Num = sc.nextInt();
			
			for(int j = 0; j < division.length; j++) {
				int count = 0;
				while(Num % division[j] == 0) {
					Num = Num / division[j];
					count ++;
				}
				arr[j] = count;
				
			}
			
			System.out.print("#" + i + " ");
			
			for(int k = 0; k < division.length; k++) {
			System.out.print(arr[k] + " ");
			}
			
			System.out.println();
			
		} sc.close();	
		

	}

}
