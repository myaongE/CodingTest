import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()){
            String s[] = sc.nextLine().split(" ");
            System.out.println(Integer.parseInt(s[0]) +
                Integer.parseInt(s[1]));
        }
        
    }
}