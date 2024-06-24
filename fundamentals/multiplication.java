// package fundamentals;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        int n,i,t;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Table ");
        n = s.nextInt();
        s.close();
        for(i = 1; i<=10 ; i++){
            t = n*i;
            System.out.println(t);
        }
    }
    
}
