import java.util.Scanner;

public class building {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		// 델타배열
		int[] row = {-1, 1, 0, 0, -1, -1, 1, 1};
		int[] col = {0, 0, -1, 1, -1, 1, -1, 1 };
	
		for(int TEST_CASE = 1; TEST_CASE <= T; TEST_CASE++) {
			int size = sc.nextInt();
			String[][] build = new String[size][size]; // N*N 배열 

			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					build[i][j] = sc.next();
				}
			}
			
			int max = 0; // 가장 높은 건물 높이

			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					
					if(!build[i][j].equals("B")) { // B가 아니면 건너뛰기
						continue;
					}
						boolean isOk = false;
						for(int a = 0; a < 8; a++) {
							int nr = i + row[a];
							int nc = j + col[a];

							if(nr >= 0 && nr < size &&
							nc >= 0 && nc < size &&
							build[nr][nc].equals("G")) {
								
								isOk = true;
								break;
								
							}
						}
					
					int height;

					if(isOk == true) { // true는 주변에 G가 있다는 뜻
						height = 2;
					}
					else {
						int count = 0;
						for(int c = 0; c < size; c++) { // 행에있는 B 개수
							if(build[i][c].equals("B"))
							count++;
						}
						for(int k = 0; k < size; k++) { // 열에 있는 B 개수
							if(build[k][j].equals("B"))
							count++;
						}

						count--;	// 중복되는 값 -1
						height = count;

					}

					if(height > max) {
						max = height;
					}


				}
			}
			
		
		System.out.println("#" + TEST_CASE + " " + max);


		}

	}

}
