package LV3;
import java.util.*;

public class swea1244_최대상금 {

    static char[] arr;              // 현재 숫자판 배열
    static int K;                   // 반드시 사용해야 하는 교환 횟수
    static int answer;              // 정확히 K번 교환한 결과 중 최댓값
    static HashSet<String> visited; // 이미 탐색한 상태 저장

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            // "123"을 ['1', '2', '3']으로 저장
            arr = sc.next().toCharArray();
            K = sc.nextInt();	// 교환횟수

            answer = 0;
            visited = new HashSet<>();

            // 아직 교환하지 않았으므로 0부터 시작
            dfs(0);

            System.out.println("#" + tc + " " + answer);
        }

    }

    static void dfs(int count) {

        String number = new String(arr);

        // 숫자 배열과 교환 횟수를 함께 저장
        // 예: 123 기준 321_1은 1번 교환해서 321을 만들었다는 뜻
        String state = number + "_" + count;

        // 같은 숫자를 같은 횟수에 이미 탐색했다면 생략
        if (visited.contains(state)) {
            return;
        }

        visited.add(state);

        // K번 교환하면 최댓값 갱신
        if (count == K) {
            int value = Integer.parseInt(number);
            answer = Math.max(answer, value);
            return;
        }

        // 교환할 두 인덱스의 모든 조합 확인
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                // 1. 두 자리를 교환
                swap(i, j);

                // 2. 교환한 상태에서 다음 교환 탐색
                dfs(count + 1);

                // 3. 다른 경우를 확인하기 위해 원상 복구
                swap(i, j);
            }
        }
    }

    static void swap(int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}