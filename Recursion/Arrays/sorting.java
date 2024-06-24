package Arrays;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = { 4 , 5 , 2 , 3 , 1} ;
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr , int s , int e) {
        if(s == 0){
            return ;
        }

        if(e < s){
            // swap
            if(arr[e] > arr[e+1]){
                int temp = arr[e];
                arr[e] = arr[e + 1] ;
                arr[ e + 1] = temp ;
            }
            bubble(arr, s, e + 1);
        }
        else{
            bubble(arr, s - 1, 0);
        }
    }
}
