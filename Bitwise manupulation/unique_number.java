// find the unique element in the given array by bitwise 

// package Bitwise manupulation;

public class unique_number {
    public static void main(String[] args) {
        int[] arr = {2 , 4 , 2 , 6 , 3 , 5 ,6 ,5 ,4};
        System.out.println(ans(arr));
    }

    private static int ans( int[] arr){

        int unique = 0 ;

        for(int n : arr){
            unique ^= n ;  // use the XOR  operator 
        }

        return unique ;
    }
}
