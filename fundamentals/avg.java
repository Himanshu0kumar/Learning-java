// package fundamentals;
import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
         int m1,m2,m3;
         float avg;
         System.out.println("Enter first letter of your name");
         Scanner s = new Scanner(System.in);
         String str = s.next();
         char ch = str.charAt(0);
         System.out.println(ch);
         System.out.println("Enter marks");
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();

        avg = (m1+m2+m3)/3;
        System.out.print("The avg is " + avg);
       s.close();
    }
    
}
