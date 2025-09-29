import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		
			int P=sc.nextInt(); // 비밀번호 값 입력 받기
            int K=sc.nextInt(); // 시작 값 입력 받기
            int num; // 몇회인지 횟수 세기

            num = (P - K) + 1; // 비밀번호 값과 시작값을 뺀 후, +1로 하여금 몇 회인지 알 수 있다.
        	System.out.println(num); // 출력

    
            
            
		
	}
}