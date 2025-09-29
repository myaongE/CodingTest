import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 표준 입력과 연결된 Scanner 객체 생성
        int T;  
        T = sc.nextInt();  // 테스트 케이스 개수 입력받기

        for (int test_case = 1; test_case <= T; test_case++) {  
            String input = sc.next();  // 날짜 문자열 입력받기 (예: "22220228")

            // 연도(앞 4자리), 월(다음 2자리), 일(마지막 2자리) 추출하기
            String year = input.substring(0, 4);
            String monthStr = input.substring(4, 6);
            String dayStr = input.substring(6, 8);

            int month = Integer.parseInt(monthStr);  // 월 문자열을 int로 변환
            int day = Integer.parseInt(dayStr);      // 일 문자열을 int로 변환

            // 월이 1보다 작거나 12보다 크면 유효하지 않은 날짜
            if (month < 1 || month > 12) {
                System.out.println("#"+test_case+" "+-1);  // -1 출력해 에러 표시
                continue;               // 다음 테스트 케이스로 넘어감
            }

            // 각 달의 최대 일 수 배열 (0번 인덱스=1월, 1번=2월, ...)
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // 일이 1보다 작거나 해당 월의 최대 일수보다 크면 유효하지 않은 날짜
            if (day < 1 || day > daysInMonth[month - 1]) {
                System.out.println("#"+test_case+" "+-1);  // -1 출력
                continue;               // 다음 테스트 케이스로 넘어감
            }

            // 날짜가 유효하므로 "#test_case 연/월/일" 형식으로 출력
            System.out.printf("#%d %s/%s/%s\n", test_case, year, monthStr, dayStr);
        }
    }
}