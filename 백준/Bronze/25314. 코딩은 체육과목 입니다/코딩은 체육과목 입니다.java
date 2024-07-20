import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int r = n / 4;

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<r; i++){
            if(i > 0){
                sb.append(" ");
            }
            sb.append("long");
        }
        sb.append(" int");
        
        System.out.println(sb.toString());
    }
}
