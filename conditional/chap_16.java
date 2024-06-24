// package conditional;
import java.util.Scanner;
public class chap_16 {
    public static void main(String[] args) {
        int age ;
        System.out.println("Enter your age");
        Scanner sc = new Scanner (System.in);
        age = sc.nextInt(); 
        if (age >= 18) {

            System.out.println("you can drive");
        }
        else{
            System.out.println("you can not drive ");
        }
        sc.close();

    }
    
}
