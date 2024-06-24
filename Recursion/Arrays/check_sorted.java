// check the given array is sorted or not by recursively 

package Arrays;

import java.util.*;
public class check_sorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter te size of the Arrays");
        int num = in.nextInt();
        int[] arr = new int[num] ;

        System.out.println("Enter the elements");
        for (int i = 0; i < num; i++) {
             arr[i] = in.nextInt() ;
        }
        
        // sorted(arr , 0);

        System.out.println(sorted(arr , 0));

        in.close();
    }

    static boolean sorted ( int[] arr , int index){
        if(index == arr.length -1){
            return true ;
        }

        return arr[index] < arr [index +1 ] && sorted(arr , index+1) ;
    }
}
