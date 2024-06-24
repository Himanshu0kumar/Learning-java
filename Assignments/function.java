package Assignments;
import java.util.Scanner;
public class function {
    /************************** Question : 1 **************************/
    // find the sum of two numbers 
    /*
    public static void main(String[] args) {
       int ans = add();
        System.out.println("The sum is "+ans);
        add2();
    }
    
    static int add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =0 ;
        sum  = a+b;
        sc.close();
        return sum;
        
    }
    
    static void add2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =0 ;
        sum  = a+b;
        System.out.println("The sum is "+sum);
        sc.close();
    }
     */
    /******************************* Question : 2 **********************/

    // find the sum 
    // pass the value of number when you are calling method in main()
    /*
    public static void main(String[] args) {
        
        int ans = addition(20, 30);
        System.out.println(ans);
        
    }
    static int addition(int num1, int num2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        num1 = sc.nextInt();
        num2= sc.nextInt();
        int sum = num1+num2;
        sc.close();
        return sum ;
    }
    */
    

    public static void main(String[] args) {
        num_max();
    }
    static void num_max(){
        int max;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three Number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a>b) {
            if (a >c) {
                
                max = a;
            }
            else{
                max = c;
            }
        }
        else  {

            if (b>c) {
                max = b;
            }
            else{
                max = c ;
            }
        }
        System.out.println(max+" is greater than others");
    }
}
