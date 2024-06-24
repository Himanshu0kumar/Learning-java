package Arrays;
import java.util.* ;

public class find_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter te size of the Arrays");
        int num = in.nextInt();
        int[] arr = new int[num] ;

        System.out.println("Enter the elements");
        for (int i = 0; i < num; i++) {
             arr[i] = in.nextInt() ;
        }
        System.out.println("Enter the target element");
        int target = in.nextInt();
        

        System.out.println(findElement(arr, target, 0));
        System.out.println(IndexElement(arr, target, 0));

        in.close();
    }
    // in boolean 
    static boolean findElement (int[] arr , int target,int index ){

        if(index == arr.length){
            return false;
        }
        return arr[index] == target || findElement(arr, target, index+1);
    }

    // in the intger formate 

    static int IndexElement (int[] arr , int target , int index){
        if(index == arr.length){
            return -1 ;
        }
        if(arr[index] == target){
            return index ;
        }
        else{
            return IndexElement(arr, target,  index+1);
        }
    }
}
