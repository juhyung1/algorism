import java.util.*;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n =sc.nextInt();
             
            char[][]arr = new char[n][n];
             
            for (int i = 0; i< n; i++) {
                String str = sc.next();
                for (int j =0; j<n; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }
             
            //아래, 오른쪽, 왼아래, 오른아래
            int[] dr = {1, 0, 1, 1,}; 
            int[] dc = {0, 1, -1, 1};
             
            boolean isTrue = false;
 
            for (int i = 0; i< n; i++) {
                for (int j =0; j<n; j++) {
                     
                    if (arr[i][j] == 'o') {
                         
                        //방향
                        for (int k = 0; k < 4; k++) {
                            int cnt = 1;
 
                            //횟수
                            for (int c = 1; c<5; c++) {
                                int nRow = i+ dr[k]*c;
                                int nCol = j+ dc[k]*c;
                                 
                                if (nRow < n && nRow >=0 && nCol < n && nCol >=0) {
                                    if (arr[nRow][nCol] == 'o') {
                                        cnt++;
                                    }
                                }
                                if (cnt == 5) 
                                    isTrue = true;
                            }
                             
                        }
                    }
                     
                    if (isTrue)
                        break;
                }
                 
                if (isTrue)
                    break;
            }
             
            if (isTrue)
                System.out.println("#"+test_case + " YES");
            else
                System.out.println("#"+test_case + " NO");
             
        }
    }
}