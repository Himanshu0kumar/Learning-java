package Assignments;

import java.util.Scanner;

public class conditional_loop_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /***************************** Question : 1 ********************************/

        // find the area of the circle
        /*
          float r ;
          double pi = 3.14;
          r = sc.nextFloat();
          double area = pi*r*r;
          System.out.println(area);
         */

        /*********************** Question : 2 ***************************************/

        // Take integer inputs till the user enters 0 and print the sum of all numbers
        /*
          int num,sum = 0;
          System.out.println("Enter a Number");
          num = sc.nextInt();
          sum = num;
          while (num != 0) {
          System.out.println("Enter Number");
          num = sc.nextInt();
          sum = sum +num;
          }
          System.out.println("The sum is "+sum);
         */

        /********************* Question :3 *****************************************/

        // Take integer inputs till the user enters 0 and print the largest number from
        // all.
        /*
          int temp;
          System.out.println("Enter a Number");
          int num = sc.nextInt();
          while (num != 0) {
          
          temp = num;
          System.out.println("Enter Number");
          num = sc.nextInt();
          if (temp>=num ) {
          System.out.println("The greater Number is "+temp);
          }
          else{
          System.out.println("The greater Number is "+num);
          }
          }
         */

        /************************** Question :4 ***************************************/

        // Factorial Program In Java
        /*
          int fact = 1 ;
          System.out.println("Enter a Number to find the factorial ");
          int num = sc.nextInt();
          if (num == 0) {
          System.out.println("The factorial is 1");
          }
          for (int i = 1; i <= num; i++) {
          fact = fact*i;
          }
          System.out.println(fact);
         */

        /********************************Question : 5************************************/

        // Calculate Average Of N Numbers
        /*
          System.out.println("How many Number you want to Enter");
          int num = sc.nextInt();
          float sum = 0, count = 0;
          for (int i = 1; i <= num; i++) {
          sum = sum +i;
          count++;
          }
          sum = sum / count;
          System.out.println(sum);
          
         */

        /**********************************
         * Question : 6
         ***********************************/

        // check the given number is prime Number or not
        /*
        int count = 0;
        System.out.println("Enter a Number to check prime or Not ");
        int num = sc.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("The given Number is prime");
        }

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                System.out.println(num +" Not a prime Number");
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num + " is a Prime Number ");
        }
        */

        /***************************** Question : 7 ************************/

        // Reverse A String In Java

        /*
        String str, nstr="";
        char ch ;
        System.out.println("Enter a String");
        str = sc.nextLine();
        System.out.print("Original Word :");
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reverse Word : " + nstr);
        */

        /************************** Question : 8 *******************************/

        // Java Program Vowel Or Consonant
        System.out.println("Enter a letter of english");
        char ch = sc.next().charAt(0);
        if (ch =='a'|| ch=='e' || ch=='i' || ch== 'o' || ch=='u') {
            System.out.println(ch+" is a Vowel");
        }
        else{
            System.out.println(ch+" is a Consonant");
        }
        sc.close();
    }
}
