import java.util.*;

public class count_zero{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a digit to coutn the zeros");

        int num = in.nextInt();
        int ans = coutZero(num);
        System.out.println(ans);

        in.close();
    }

    static int coutZero(int n){
        return helper( n , 0);
    }

    static int helper(int n ,int c){

        if(n == 0){
            return c;
        }

        int rem = n % 10 ;
        if(rem == 0 ){
            return helper(n/10, c+1);
        }

        return helper(n/10, c);
        
    }
}