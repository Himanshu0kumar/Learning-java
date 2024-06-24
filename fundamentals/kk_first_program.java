// package fundamentals;
import java.util.Scanner;
public class kk_first_program {
    public static void main(String[] args) {
        
        System.out.println("Hello World !");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        // This is typecasting 
        int num = (int)(65.67f);
        System.out.println(num);

        // Automatic type promotion in expression

        int a = 257 ;
        byte b = (byte)(a); // 257 % 256 = 1;
        System.out.println(b);
        sc.close();
    }
    
}
