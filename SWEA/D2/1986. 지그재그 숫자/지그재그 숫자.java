import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int a = sc.nextInt();
            int sum = 0;
            for(int i=1; i<=a; i++){
                if(i % 2 == 1){
                    sum+=i;
                }else if(i % 2 == 0){
                    sum-=i;
                }
           	}
            System.out.printf("#%d %d\n", test_case, sum);
		}
	}
}