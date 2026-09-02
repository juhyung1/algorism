import java.util.Scanner;
 
public class sollution {
    public static void main(String args[]) throws Exception {
         
        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();	
        
//        for (int test_case = 1; test_case <= 1; test_case++) {
        	
        	String a2z = sc.next();// 알파벳 A~Z 문자열 받기
        	 
            for (int i = 0; i < a2z.length(); i++) // 문자열 길이만큼 돌기
                System.out.print((a2z.charAt(i) - 66) + " ");
//          문자열을 하나씩 돌며 1부터 출력
//          A의 아스키코드가 65이므로 빼주고, 1을 더해 출력
        	
        	
 
        } 	// tc 
    }		// main
//}
