import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
            if (A == B) { // A와 B 비기는 경우
            System.out.println("비겼다");
            } else if ( // A가 이길 경우만
                (A == 1 && B == 3) ||
                (A == 2 && B == 1) ||
                (A == 3 && B == 2)
            ) {
                System.out.println("A");
            } else { // A가 이길 경우 제외, 나머지 B가 이길 경우
                System.out.println("B");
            }

	}
}