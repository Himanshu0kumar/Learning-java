package Practice.Arrays ;

public class SearchElements{
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3, 4, 5, 6,7};
        int target = 3 ;
        System.out.println(search(arr ,target));
    }
    
    static int search(int[] arr , int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i; 
            }
        }
        return target;
    }
}
