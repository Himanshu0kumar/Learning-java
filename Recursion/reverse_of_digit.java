import java.util.*;
public class reverse_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digit for Reverse it");
        int num = in.nextInt();
        rev(num);
        System.out.println(sum);
        in.close();
    }
    static int sum = 0 ;  // scoping 
    static void rev(int n){
        if(n == 0){
            return ;
        }
        int rem = n % 10 ;
        sum = sum * 10 + rem ;
        rev(n/10);
    }
}
