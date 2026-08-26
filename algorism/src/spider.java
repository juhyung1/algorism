import java.util.Scanner;

public class spider {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		
		int idxR = 0; // 거미줄 시작위치 저장할 변수
		int idxC = 0; 
		
		int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
		int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				
				if(arr[i][j] == 1) {	// 1일때(장애물일때)
					continue;					
				}
				
				int count = 1;
				
				for(int k = 0; k < 8; k++) {
					int row = i + dr[k]; 
					int col = j + dc[k];
					
					int rock = 0; // 장애물 확인
					
					while(row >= 0 && row < size &&
							col >= 0 && col < size) { // 배열 끝까지 반복
						if(arr[row][col] == 1) { // 장애물인지 확인
							rock ++;
							if(rock == 2) {	// 장애물이 연속 2개 인지 확인
								break;
							}
						} else {// 장애물이 없을 때(공백일때)
							count ++;
							rock = 0;
						}
						
						// 현재 방향으로 한 칸 이동하기
						row += dr[k];
						col += dc[k];			
						
					}
				}
				if(count > max) {
					max = count;
					idxR = i;
					idxC = j;
				}				
			}
		}
		System.out.println(max);
		System.out.println(idxR + "," + idxC);
		

	}// main

}
