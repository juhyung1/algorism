package LV3;

import java.util.Scanner;

public class SWEA_1208_Flatten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {

            int[] boxes = new int[100];

            int attempt = sc.nextInt();

            int max = 0;
            int maxIdx = 0;
            int min = 101;
            int minIdx = 0;

            for (int i = 0; i < 100; i++) {
                boxes[i] = sc.nextInt();
            }

            for (int i = 0; i < attempt; i++) {

                max = 0;
                maxIdx = 0;
                min = 101;
                minIdx = 0;

                for (int j = 0; j < boxes.length; j++) {
                    if (max < boxes[j]) {
                        max = boxes[j];
                        maxIdx = j;
                    }
                }

                for (int j = 0; j < boxes.length; j++) {
                    if (min > boxes[j]) {
                        min = boxes[j];
                        minIdx = j;
                    }
                }

                if (max - min <= 1)
                    break;

                boxes[maxIdx] -= 1;
                boxes[minIdx] += 1;

            }

            // 옮긴 직후 상태로 max, min을 다시 계산 (리셋 필수!)
            max = 0;
            maxIdx = 0;
            min = 101;
            minIdx = 0;

            for (int j = 0; j < boxes.length; j++) {
                if (max < boxes[j]) {
                    max = boxes[j];
                    maxIdx = j;
                }
            }
            for (int j = 0; j < boxes.length; j++) {
                if (min > boxes[j]) {
                    min = boxes[j];
                    minIdx = j;
                }
            }

            System.out.println("#" + tc + " " + (max - min));

        }
        sc.close();
    }
}