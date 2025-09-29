import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 값을 받고
        String str = String.valueOf(a); // 문자열로 형변환
       	int sum = 0; // 자릿수를 더할 sum 선언
        
        for(int i=0; i < str.length(); i++){ // 문자열로 형변환한 길이대로 반복문
            sum += str.charAt(i) - '0';  // i 위치의 문자를 숫자로 반환한다. 
            								  // '0'을 빼는 이유 : ex) 문자 '3'에서 '0'을 빼면 아스키 코드 차이로 
            								  // 51-48=3이라는 정수값이 나온다. 이를 통해 정수 3으로 변환
        }
        System.out.println(sum); // 출력
        
	}
}