
// Write a program to reverse a Array 

import java.util.*;
public class ReversArray {
    public static void main(String[] args) {
        int[] arr = {5 , 4 , 3 , 2 , 1};
        Revers2(arr);
        System.out.println(Arrays.toString(arr));
    } 
    // first method 

    static void Revers(int[] arr){
        int start = 0 ;
        int end = arr.length - 1 ;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start++ ;
            end-- ;
        }
    }
    // second method 
    
    static void Revers2(int[] arr){
        int n = arr.length-1;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }
}
