import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		
			int P=sc.nextInt(); // 비밀번호 값 입력 받기
            int K=sc.nextInt(); // 시작 값 입력 받기
         	int sum = 1;
        	while(true){
                if(K==P) break;
                K++;
                sum++;
            }
        	System.out.println(sum); // 출력

	}
}