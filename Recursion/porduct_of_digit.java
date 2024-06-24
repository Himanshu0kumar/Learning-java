import java.util.*;
public class porduct_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a Number to find sum of that digit");
        int num = in.nextInt();
        int ans = product(num);
        System.out.println(ans);

        in.close();
    }

    static int product( int n){

        if(n % 10 == n){
            return n ;
        }

        return (n%10) * product(n/10);
    }
}
