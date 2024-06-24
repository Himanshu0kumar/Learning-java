package function;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        greeting(); // call for greeting function 
       // sum();  // function call for sum 
     //  int ans = sum2();
     //System.out.println(ans);
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter two Numbers :");
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();

     int sumation = sum3(num1,num2);
     System.out.println("The sum is :" + sumation);
     sc.close();

    }
    // display a greeting message 
    
    static void greeting(){
        System.out.println("Hello World");
    }

    // create a function for sum of two numbers 

    static void sum(){
        Scanner in = new Scanner (System.in);
        int num1,num2,sum ;
        System.out.println("Enter Number one :");
        num1 = in.nextInt();
        System.out.println("Enter Number two :");
        num2 = in.nextInt();
        sum = num1 + num2 ;
        System.out.println("The sum is :" + sum);
        in.close();
    }
    // create a function of sum of return type 
    static int sum2(){
        Scanner in = new Scanner (System.in);
        int num1,num2,sum ;
        System.out.println("Enter Number one :");
        num1 = in.nextInt();
        System.out.println("Enter Number two :");
        num2 = in.nextInt();
        sum = num1 + num2 ;
        in.close();
        return sum;
    }
    // create a function to pass a parameter 
    static int sum3(int a , int b){
        int sum = a + b ;
        return sum ;
    }

}