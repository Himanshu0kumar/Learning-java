// find the sum of the digit 

import java.util.*;
public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a Number to find sum of that digit");
        int num = in.nextInt();
        int ans = sum(num);
        System.out.println(ans);

        in.close();
    }

    static int sum ( int n){

        if(n == 0){
            return 0 ;
        }

        return (n%10) + sum(n/10);
    }
}
