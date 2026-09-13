package IM준비;

import java.util.Scanner;

public class swea14555_공과잡초 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int T = sc.nextInt();

	        for (int tc = 1; tc <= T; tc++) {
	            String str = sc.next();

	            int size = str.length();
	            char[] ch = new char[size];

	            for (int i = 0; i < size; i++) {
	                ch[i] = str.charAt(i);
	            }

	            int count = 0;

	            for (int i = 0; i < size; i++) {

	                // '('가 보이면 공 하나
	                if (ch[i] == '(') {
	                    count++;
	                }

	                // ')'가 보이고 바로 앞이 '('가 아니면 공 하나
	                else if (ch[i] == ')'
	                        && (ch[i - 1] != '(')) {
	                    count++;
	                }
	            }

	            System.out.println("#" + tc + " " + count);
	        }

	        sc.close();
	    }
}
