import java.util.*;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();
      int r = 0;

      for(int i=1; i<t+1; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
          
        r = a+b;
          
        System.out.println("Case #"+i+": "+a+" + "+b+" = "+r);
      }
    }
}