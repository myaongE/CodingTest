import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum= 1;
        System.out.printf("1 ");
        for(int i=1; i<=a; i++){
            sum *= 2;
            System.out.printf("%d ", sum);
        }
	}
}