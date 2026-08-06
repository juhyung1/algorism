package algorism;

import java.util.Scanner;

public class swea2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
            String letter = sc.next();
            char[] ch = letter.toCharArray();

            int count = 0;
            
            for(int i = 1; i < ch.length; i++) {
            	if(ch[count] == ch[i]) {
            		count++;
            	}
            	else {
            		count = 0;
            	}
            }
		int result = 30 - count;
			
		System.out.println("#" + test_case + " " + result);
		}//tc
		
	}

}
