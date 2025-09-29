import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum;
        
        for(int i=0; i<=a; i++){
            sum=a-i;
            System.out.printf("%d ", sum);
        }
	}
}