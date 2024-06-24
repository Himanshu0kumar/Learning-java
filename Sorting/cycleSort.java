
//  Its works only when elements of the array is from from one to N without leaving any elements

package Sorting;
import java.util.*;
public class cycleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of the Array");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        sort(arr); // calling the sort function 

        System.out.println(".......................The Array After sorting.......................");
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    static void sort(int[] arr){
        int i = 0 ;
        while(i < arr.length){
            int correct = arr[i] - 1 ;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
