package Practice.Arrays;

// find the maximum and minmum elements in the given array 
public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {3 ,2, 1 ,56 ,1000 ,167};
        int maxElement = arr[0] ; int minElement = arr[0] ;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("The max elements is "+maxElement);

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < minElement){
                minElement = arr[i];
            }
        }
        System.out.println("The min elements is "+minElement);
    }
}
