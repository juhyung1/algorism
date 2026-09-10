import java.util.Scanner;

public class 수영장 {
	static int d, m1, m3, y; // 일일권, 한달권, 세달권, 연간권
	static int[] month;	// 각 달의 이용계획
	static int ans; // 최소비용

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			d = sc.nextInt();
			m1 = sc.nextInt();
			m3 = sc.nextInt();
			y = sc.nextInt();
			
			month = new int[13]; // 1월~12월 , 0번 인덱스는 총합을 가지고 있기
			for(int i = 1; i < 13; i++) {
				month[i] = sc.nextInt();
				month[0] += month[i];
			}
			
//			ans = Integer.MAX_VALUE;
			
			ans = y; // 1년권으로 초기화
//			swim(1,0);
			swimDP();
			 
			System.out.println("#" + tc + " " + ans);
			
		}	//tc

	}	// main
	
	// m : 이용권을 고르는 달
	// fee : 지금까지 누적한 값
	private static void swim(int m, int fee) {
		if(fee > ans) return;	// 내가 최소로 알고 있는 값보다 fee가더 커버리면 정답이 될 수 없다
		// month[m] == 0; -> 밑에 한칸씩 고려해야 하나?
		
		
		// 종료 조건
		if(m > 12) {
			ans = Math.min(ans, fee);
			return;
		}
		
		// 재귀 호출
//		swim(m + 1, fee + d * month[m]);	// 1일권
//		swim(m + 1, fee + m1);				// 한달권
		swim(m + 1, fee + Math.min(m1,  d * month[m]));	// 1일권, 한달권 중 더 저렴한 것
		swim(m + 3, fee + m3);				// 세달권
		
		
	}
	
	static void swimDP() {
		// month 각 달의 이용 계획
		
		int[] dp = new int[13];
		dp[1] = Math.min(m1,  month[1]*d);
		dp[2] = dp[1] + Math.min(m1,  month[2] * d);
		
		for(int i = 3; i <= 12; i++) {
			dp[i] = Math.min(m3 + dp[i-3], Math.min(m1 + dp[i-1], month[i] * d + dp[i-1]));
		}
		
//		dp[12] -> 12월까지 사용한 요금인데 최소비용으로 채워져 있다. (1일권, 한달권, 세달권 만을 고려했을 때)
		
		// 진짜 최소비용
//		dr[12] vs y      1년권과 비교 후 더 작은 값으로 결정
		ans = Math.min(y, dp[12]);
		
		
		
	}

}
