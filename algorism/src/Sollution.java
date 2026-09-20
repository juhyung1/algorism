import java.util.*;
 
public class Sollution {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
 
            int[][] map = new int[N][N];
 
            // 2차원배열 넣기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            // 십자가
            int[] dr1 = { 0, -1, 0, 1 };
            int[] dc1 = { -1, 0, 1, 0 };
            int nr1 = 0;
            int nc1 = 0;
            int ans1 = 0;
            int ans2 = 0;
 
            // 대각선
            int[] dr2 = { 1, -1, -1, 1 };
            int[] dc2 = { -1, -1, 1, 1 };
            int nr2 = 0;
            int nc2 = 0;
 
            //십자가 합
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int sum1 = map[i][j];
                    for (int k = 0; k < 4; k++) {
                        for (int l = 1; l < M; l++) {
                            nr1 = i + (dr1[k] * l);
                            nc1 = j + (dc1[k] * l);
 
                            if (nc1 < 0 || nr1 < 0 || nc1 >= N || nr1 >= N) {
                                break;
                            }else {
                                sum1+=map[nr1][nc1];
                            }
                        }
                        ans1 = Math.max(ans1, sum1);
 
                    }
                }
            }
             
            //대각선 합
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                     
                    int sum2 = map[i][j];
                     
                    for (int k = 0; k < 4; k++) {
                         
                        for (int l = 1; l < M; l++) {
                             
                            nr2 = i + (dr2[k] * l);
                            nc2 = j + (dc2[k] * l);
 
                            if (nc2 < 0 || nr2 < 0 || nc2 >= N || nr2 >= N) {
                                break;
                            }
                                sum2+=map[nr2][nc2];
                                 
                            }
                        }
 
                        ans2=Math.max(ans2, sum2);
                    }
                }
            int answer = Math.max(ans1, ans2);
             
            System.out.println("#" + tc + " " + answer);
             
             
             
        } // tc
    }// main
}// class