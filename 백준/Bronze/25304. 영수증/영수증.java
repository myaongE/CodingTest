import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt(); // 총액
        int k = sc.nextInt(); // 구입 물품 종류 수
        int r = 0;


        for(int i=1; i<=k; i++){
            int a = sc.nextInt(); // 제품 가격 
            int b = sc.nextInt(); // 제품 개수
            r += a * b;
        }
        
        if(m==r){
        System.out.println("Yes");
        }else {
        System.out.println("No");
        }
    }
}