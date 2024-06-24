// package fundamentals;
import java.util.Scanner;
public class add_numbers {
     public static void main(String[] args) {
         int a,b,c;
         System.out.println("Enter two Numbers");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = (a + b);
        System.out.println(c);
        s.close();
    }
}
