import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
 		int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.printf("%d\n %d\n %d\n %d\n", a + b, a - b, a * b, a % b);
        
	}
}