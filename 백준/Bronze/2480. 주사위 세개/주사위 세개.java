import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 

        int m = 0;

        if(a==b && b==c) {
            m = 10000+(a*1000);
        }else if(a==b || b==c || a==c) {
            if(a==b || b==c){
                m = 1000+(b*100);                
            }else if(b==c || a==c){
                m = 1000+(c*100);
            }
        }else if(a!=b && b!=c && a!=c) {
            if(a>b && a>c){
                m = a*100;
            }else if(b>a && b>c){
                m = b*100;
            }else {
                m = c*100;
            }
        }
        System.out.println(m);
 }
}
