import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                // 조건 검사 등 필요시 여기서
                sum += num;
            }

            double avgDouble = sum / 10.0;               // 실수로 나누기
            int avg = (int) Math.round(avgDouble);      // 반올림 후 정수 변환
            System.out.printf("#%d %d\n", test_case, avg);
        }
    }
}
