package Assignments;
import java.util.Scanner;

public class exer_02pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /****************** Question : 1 ******************************** */
        // Write a program to print whether a number is even or odd, also take input from the user.
        
       /* System.out.println("Enter a Number to check even or odd");
        int num = sc.nextInt();
        if (num % 2 ==0) {
            System.out.println(num + "is evern Number");
        }
        else{
            System.out.println(num + "is odd Number");
        }   */

        /******************************** Question : 2 **************************** */

        // Take name as input and print a greeting message for that particular name.
        
      /*  System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Hello ," + " " + name);   */


        /************************** Question : 3 ************************/
        
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        
      /*  System.out.println("Enter the value of P, R, T");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        int t = sc.nextInt();
        
        float si = (p*r*t)/100;
        System.out.println("Total intrest is "+si);
        si = si+p ;
        System.out.println("Total amount is "+si);    */


        /************************** Question : 4 **************************/

        // Take 2 numbers as input and print the largest number.
        /*
        System.out.println("Enter two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1>num2) {
            System.out.printf("%d is greater than %d",num1,num2);
        }
        else{
            System.out.println(num2+" is grater than "+num1);
        }
        */

        /**************************** Question : 5 ****************************/

        // Input currency in rupees and output in USD.
        /*
        System.out.println("Enter your Money in Rs");
        float rs = sc.nextFloat();

        rs = rs/70;
        System.out.printf("The Amount in Dollar is %.2f ",rs);
            */


            /**************************** Question : 6 *************************/

            // To calculate Fibonacci Series up to n numbers.
            
           /* System.out.println("Enter the Number ");
            int num = sc.nextInt();
            int num1 = 0;
            int num2 = 1;
            int count = 2;
            while (count<=num) {
                int temp = num2;
                num2 = num2 + num1;
                num1 = temp;
                count++;
            }
            System.out.println(num2);
            */

            /**************************** Question : 7 ***************************/

            // To find out whether the given String is Palindrome or not.
            
            System.out.println("Enter a Number to check its palidrome ");
            int num, temp , remainder, reverse = 0;
            num = sc.nextInt();
            temp = num ;
            while (num !=0) {
                remainder = num % 10;
                reverse = reverse *10 + remainder;
                num = num /10;
            }
            if (temp == reverse) {
                System.out.println(" The Number is Palidrome ");
            }
            else{
                System.out.println(" Not a Palidrome Number ");
            }
            
        sc.close();
    }
}
