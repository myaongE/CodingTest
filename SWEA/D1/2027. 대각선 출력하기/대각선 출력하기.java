import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print("+");
                for(int m=4; m<0; m--){
                    System.out.print("+");
                }
            }
            System.out.print("#");
            for(int j = 0; j < 5 - i - 1; j++) {
                System.out.print("+");
            }System.out.println();
        }
	}
}