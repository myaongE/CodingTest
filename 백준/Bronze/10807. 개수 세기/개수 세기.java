import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열의 크기 입력
        int a = sc.nextInt();
        int[] b = new int[a];  // int 배열로 변경

        // 배열 값 입력받기
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt(); // 배열에 값 채우기
        }

        // 찾을 숫자 입력받기
        int inputNum = sc.nextInt();

        // 배열에서 해당 숫자의 개수 세기
        int count = 0;
        for (int num : b) {
            if (num == inputNum) {
                count++;
            }
        }

        // 결과 출력 
        System.out.println(count);
    }
}
