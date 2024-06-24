package Sorting;
import java.util.*;
public class selection {
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
        selectionSort(arr);
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i]+" ");

        }
    }
    // this is the function of 
    static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int last = arr.length - i -1 ;
            int maxIndex = getMaxIndex(arr,0,last); 
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
    static int getMaxIndex(int[] arr , int start , int end){
        int max = start;
        for(int i = 0 ; i < end ; i++){
            if(arr[max]<arr[i]){
                max = i ;
            }
        }
        return max ;
    }
}
