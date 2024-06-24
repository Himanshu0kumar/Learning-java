package Sorting;
import java.util.*;
public class insertion {
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
        insertionSort(arr); // fucntion call
        // To display the Array
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i]+" ");

        }
    }
    static void insertionSort(int[] arr){
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = i+1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j - 1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
