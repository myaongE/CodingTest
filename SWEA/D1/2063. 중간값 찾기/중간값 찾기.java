import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫 줄 입력 (점수 개수)
        int[] scores = new int[N]; // 점수 개수대로 문자열 만들기

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();  // 다음 줄에서 점수 N개 입력받기
        }
        Arrays.sort(scores); // 배열 오름차순 정렬
        
        int midIndex = N / 2; // 배열의 중간 인덱스 계산 -> 정수 나눗셈으로 중간 위치 찾는다
        int median = scores[midIndex];  // 정렬된 배열에서 중간 인덱스에 위치한 정수를 중간값으로 저장
        
        System.out.println(median);  // 중간값 출력
    }
}