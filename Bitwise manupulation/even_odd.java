// check the given number is Even of Odd by bitwise operator 

// package Bitwise manupulation;

public class even_odd {
    public static void main(String[] args) {
        int n = 43 ;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n){
        return (n & 1) == 1 ; // if its true its mean given number in Odd 
    }
}
