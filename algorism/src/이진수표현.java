import java.util.Scanner;

public class 이진수표현 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int MBit = (1 << N) - 1;
			
			if( (M & MBit) == MBit) {
				System.out.println("#" + tc + " ON");
			}
			else {
				System.out.println("#" + tc + " OFF");
			}			
		}	// tc
	}		// main
}
