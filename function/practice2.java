package function;
import java.util.*;
public class practice2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = in.nextInt();
        // int num2 = in.nextInt();

        // int sum = Sumation(num1, num2);
        in.close();
        // System.out.println("The sum of two Numbers is :" + sum);
        EvenOdd(num1);
        Table(num1);

    }
    
    //  create a function for the sum of two numbers 

    static int Sumation(int a , int b){
        return a+b ;
    }

    // create a function to print the table of given number n 
    static void Table(int n){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + n*i );
        }
        return ;
    }

    // creating a function to check given number is even or odd 

    static void EvenOdd(int n){
        if(n % 2 == 0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }

    // create a function to check number is prime or not 
    static void PrimeNumber(int n){
        
    }
}
