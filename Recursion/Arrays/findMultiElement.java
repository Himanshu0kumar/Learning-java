// find all index of an elements  present in the Array 

package Arrays;

import java.util.ArrayList;

public class findMultiElement {
    public static void main(String[] args) {
        int[] arr = {8,4,34, 3,4,7,56, 9,4} ;
        find(arr, 4, 0);
        System.out.println(list);

        ArrayList <Integer> ans = findAllIndex(arr, 4, 0,new ArrayList<>());
        System.out.println(ans);
    }

    // this is the method where a new array list created again and again which is not a feasible solution
    static ArrayList<Integer> list = new ArrayList<>();
    static void find( int[] arr , int target , int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
         find(arr, target,  index+1);
        
    }

    // this is the method where a list is pointing to same object 

    static ArrayList<Integer> findAllIndex(int[] arr , int target , int index , ArrayList<Integer>list){
        if(index == arr.length){
            return list ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1,  list);
    }
}
