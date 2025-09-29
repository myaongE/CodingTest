import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // 문자열 입력받고

        for (int i = 0; i < str.length(); i++) { // 문자열 길이만큼 반복합니다
            char ch = str.charAt(i); // 입력 받은 문자열 str을 char로 형변환하고 
            int num = ch - 'A' + 1; // 'A' 문자의 아스키 값인 65를 빼고 1을 더하면 알파벳 순서가 나옵니다.
            System.out.print(num + " "); // 순서대로 값이 나옵니다
        }
	}
}