import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수를 입력받습니다.
        int T = sc.nextInt();
        sc.nextLine();

        // 각 테스트 케이스를 처리합니다.
        for (int t = 0; t < T; t++) {
            int[] nlist = new int[10];

            // 배열의 10개 원소를 입력받습니다.
            for (int i = 0; i < 10; i++) {
                nlist[i] = sc.nextInt();
            }
            Arrays.sort(nlist); // 정렬

            System.out.println(nlist[7]); // 3번째로 큰 수
            sc.nextLine();
        }
        sc.close();
    }
}
