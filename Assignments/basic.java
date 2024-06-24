package Assignments;
import java.util.Scanner; 
public class basic {
    public static void main(String[] args) {
        
        /************************* Questioin : 1 *************************/

        // Input a year and find wheather it is leap year or not 

    
        Scanner sc = new Scanner (System.in);
       /* System.out.println("Enter a year which is leap year or not !");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year %100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is leap" );
        }
        else{
            System.out.println("Not a leap year");
        }*/


        /*************************Question : 2 ******************* */
        
        // Take two Number and print the sum of both 

      /*  System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ; 
        System.out.println(sum);  */


        /************************Question : 3 ****************************** */

        // Take a number as input and print the multiplication of it
       
       /* System.out.println("Enter a number of its mutiplication");
         int a = sc.nextInt();
         int mul= 0;
         for(int i = 0 ; i<= 10 ; i++){
            mul = a*i;
            System.out.println(mul);
         }                 */


         /************************* Question : 4 *************************************/
          
         //Take two number as input and find their LCM and HCF 

        /* System.out.println("Enter two Number to find LCM and  HCF");
         int num1, num2,temp1,temp2,temp,lcm,hcf;
          num1 = sc.nextInt();
          num2 = sc.nextInt();
         
         temp1 = num1;
         temp2 = num2;

         while (temp2 !=0) {
             temp = temp2;
             temp2 = temp1%temp2;
             temp1 = temp;
         }
        hcf = temp1;
        lcm = (num1*num2)/hcf;
        System.out.println("HCF of input is" +hcf);
        System.out.println("HCF of input is" +lcm);   */
         

         

         /*************************** Question : 5 ************************************/

         //keep taking Number as input till the user enter 'x' after that sum of all 

         int ans = 0;
         while (true ) {
             System.out.println("Enter operator");
             // take the operator as input
             char op = sc.next().trim().charAt(0);
             if(op == '+' || op == '-' || op == '*' || op =='/' || op == '%'){
                 // input two numbers
                 System.out.println("Enter two Numbers");
                 int num1 = sc.nextInt();
                 int num2 = sc.nextInt();
                 if (op =='+') {
                     ans = num1+num2;
                 }    
                 if (op == '-') {
                     ans = num1-num2;
                 }
                 if (op== '*') {
                     ans = num1*num2;
                 }
                 if (op=='/') {
                     if (num2 != 0) {
                         ans = num1/num2;
                     }
                 }
                 if (op == '%') {
                    ans =  num1 % num2;
                 }
                }
                else if (op == 'x') {
                    break;
                }
                else{
                    System.out.println("Invalid Operation !");
                }
                sc.close();
                System.out.println("The Answer is "+ans);
            }
            
        }
        
    }
