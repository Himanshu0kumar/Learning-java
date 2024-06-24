// print the pattern like this 

//   A 
//   B C 
//   C D E 
//   D E F G



package loops;
import java.util.Scanner;
public class pattern03 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        s.close();
        for (int i = 1; i <=n; i++) {
            char k = (char)('A' + i - 1);
            for (int j = 1; j <=i; j++) {
                System.out.print(k);
                k = (char)(k+1);
            }
            System.out.println();
        }
        }
    
}