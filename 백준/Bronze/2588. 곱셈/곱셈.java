import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int num1 = ((B % 10) / 1) * A;
        int num2 = ((B % 100) / 10) * A;
        int num3 = ((B % 1000) / 100) * A;
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num1+(num2*10)+(num3*100));
        
    }    
}