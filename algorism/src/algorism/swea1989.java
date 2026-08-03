package algorism;
import java.util.*;

public class swea1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		
		
		for(int TEST_CASE = 1; TEST_CASE <= T; TEST_CASE++) {
//			String word = sc.next(); next()는 공백(스페이스, 탭, 줄바꿈 인식)
			String word = sc.nextLine(); // 공백 상관없이 한 줄 전체
			
			int leng = word.length();
			int result = 1;
			
			for(int i = 0; i < leng / 2; i++) {
				if(word.charAt(i) != word.charAt(leng -1 -i)) {
					result = 0;
				break;
				}
			}
			
			
			System.out.println("#" + TEST_CASE + " " + result);
			
			
		}
		
		
		
		
	}

}
