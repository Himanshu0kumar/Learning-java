package searching.BinarySearch;
import java.util.*;
public class basic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // int arr[] = {2,4,6,7,9,12,15,22,45,87,99,121,230,456};
        // int target = 6;

        System.out.println("Enter the size of array ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array ");
        for(int  i = 0 ; i < size ; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the you want ot search in the array ");
        int target = in.nextInt();
        in.close();

        int ans = BinarySearching(arr, target);
        if(ans != -1){

            System.out.println("The element is found at index no : " + ans);
        }
        else{
            System.out.println("The elements was not found");
        }
    }

    // return the index
    // return -1 if does not exit
    static int BinarySearching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // int mid = (start + end)/2 ;    // might be possible exceeds the range of integer

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                // left
                end = mid - 1;
            } else if (target > arr[mid]) {
                // right
                start = mid + 1;
            } else {
                // found answer
                return mid;
            }
        }
        return -1;
    }

}
