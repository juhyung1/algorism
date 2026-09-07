package LV3;

import java.util.Scanner;

public class swea26389_여행 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			char[] ch = new char[1000];
			
			String str = sc.next();
			
			for(int i = 0; i < str.length(); i++) {
				ch[i] = str.charAt(i);						
			}
			
			boolean w = false;
			boolean e = false;
			boolean n = false;
			boolean s = false;
			for(int i = 0; i < ch.length; i++) {
				
				
				switch(ch[i]) {
				case 'N' :
					n = true;
					break;
				case 'S' :
					s = true;
					break;
				case 'W' :
					w = true;
					break;
				case 'E' :
					e = true;
					break;
					
				}
			}
			if((n == s) && (w == e) ) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
				
			
		}	// tc
	}		// main
}
