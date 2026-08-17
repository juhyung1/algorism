import java.util.Scanner;

public class checkMate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int N = sc.nextInt();
			
			int[][] check = new int[N+2][N+2];
			
			int kingX = sc.nextInt();
			int kingY = sc.nextInt();
			
			int queenX = sc.nextInt(); 
			int queenY = sc.nextInt();
			
			int result = 0;
			
			int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
			int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};
			
			for(int i = 0; i < 8; i++) {
				int row = queenX + dr[i];
				int col = queenY + dc[i];
				
				
				if(row == kingX && col == kingY) {
					result = 1;
				}
				
			}
			System.out.println("#" + test_case + " " + result);			
			
		}	//tc
	}	//main
}
