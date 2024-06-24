package loops;
import java.util.Scanner;
public class pattern02 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        s.close();
        for (int i = 0; i <=n; i++) {
            for (int j = i; j <=i && j>0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        }
    
}