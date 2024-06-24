
// This will print the value from N to 1 
import java.util.*;
public class print_Nto_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number for Print");
        int num = in.nextInt();
        // fun(num); 

        // Revfun(num); 
         printGfg(num);

        in.close();
    }

    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }

    // print form 1 to N .
     
    static void Revfun(int n){
        if(n== 0){
            return ;
        }

        Revfun(n-1);
        System.out.println(n);
    }
    static void printGfg(int N){
        if(N <= 0 ){
            return ;
        }
        System.out.print("GFG" + " ") ;
        printGfg(N - 1);
    }
}