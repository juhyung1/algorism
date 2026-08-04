package algorism;
import java.util.*;

public class swea1284 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int TEST_CASE = 1; TEST_CASE <= T; TEST_CASE++) {
			
			int normalLiterPerMoney = sc.nextInt(); // 1리터당 P원
			int normalMoney = sc.nextInt();			// 기본요즘 Q원
			int liter = sc.nextInt();				// 월간사용량 R리터이하
			int literMoney = sc.nextInt();			// R보다 많은경우 초과량에 대해 1L당 S원
			int userLiter = sc.nextInt();			// 내가 사용한 수도 양 W리터
			
			
			
			int AMoney = normalLiterPerMoney * userLiter;
			int BMoney = 0;
			
			if(userLiter <= liter) {
				BMoney = normalMoney;
			}
			else if(userLiter > liter) {
				BMoney = normalMoney + literMoney * (userLiter - liter);
				}
			
			int result = 0;
			if(AMoney >= BMoney) {
				result = AMoney;
			}
			else if(AMoney < BMoney) {
				result = BMoney;
			}
			
			System.out.println("#" + TEST_CASE + " " + result);
			
			
			
			
			
		}

	}

}
