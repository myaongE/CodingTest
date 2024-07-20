import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt(); 
        int m = sc.nextInt(); 
        int c = sc.nextInt(); 
        
        m += c;
        
        h += m / 60;
        
        m = m % 60;

        h = h % 24;
        
            System.out.print(h+" ");
            System.out.print(m);

 }
}
