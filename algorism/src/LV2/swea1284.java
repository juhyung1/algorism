package LV2;
import java.util.*;

public class swea1284 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int TEST_CASE = 1; TEST_CASE <= T; TEST_CASE++) {
			
			
			
			int P = sc.nextInt();		// A사 1L당 P원
			int Q = sc.nextInt();		// B사 월산사용량 R리터 이하 Q원 
			int R = sc.nextInt();		// 월산사용량 R리터 이하
			int S = sc.nextInt();		// B사 R리터 이상 1L당 S원
			int W = sc.nextInt();		// 한달 간 사용하는 수도 양 W리터
			
			int aWon = P * W; // A사 총 요금
			int bWon = Q;
			int result = aWon;
			
			if(R < W) {
				bWon = Q + (W - R) * S;
			}
			
			
			if(aWon >= bWon) {
				result = bWon;
			}
			
			System.out.println("#" + TEST_CASE + " " + result);
			
			
			// P Q R S W
			// 9 100 20 3 10
			// 8 300 100 10 250
			
		} //tc

	}

}
