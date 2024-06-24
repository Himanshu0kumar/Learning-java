import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to find the Factorial of that Nummber");
        int num = in.nextInt();

        // for the factorial of a Number 
         int ans = fact(num);
         System.out.println(ans);

         // for the sum 
         int sum_ans = sum(num);
         System.out.println(sum_ans);
        in.close();
    }
    static int fact(int n ){

        if(n <= 1){ // assume that there is nothing any negative Number 
            return 1;
        }

        return n*fact(n-1);
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n+sum(n-1);
    }
}
