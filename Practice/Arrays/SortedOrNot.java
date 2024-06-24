package Practice.Arrays;

import java.util.Arrays;

// write a program to check whether given array is sorted or not 

public class SortedOrNot {
    public static void main(String[] args) {
    int[] arr = {1 , 3 , 4 ,1 , 2 , 4 ,3 ,1};

    // int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]);

        }
    // arraySortedOrNot(arr , 6);

    }

    static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        int count = 0 ;
        for (int i = 1; i < arr.length; i++){
            if(arr[i-1] < arr[i]){
                count++;
            }
        }
        if(count == n -1){
            System.out.println("True");
            return true ;
        }
        return false ;
    }

}
