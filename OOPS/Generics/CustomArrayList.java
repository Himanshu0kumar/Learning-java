package OOPS.Generics;

// import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data ;
    private static int DEFAULT_SIZE = 10 ;
    private int size = 0 ;      // also working as a index value  

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    // Adding elements in the ArrayList 
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num ;
    }

    // checking whether ArrayList is full or not 
    private boolean isFull(){
        return size == data.length;
    }
    // Increasing the size of the ArrayList 
    private void resize(){
        int[] temp = new int[data.length * 2];

        // copy the current items in the new Array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data= temp ;
    }

    // removing the elements 
    public int remove(){
        int removed = data[--size];  // decrease the size by 1 
        return removed ;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size ;
    }
    public void set(int index , int value){
        data[index] = value ;
    }
    
    @Override
    public String toString() {
        return "CustomArrayList{" +
        "data=" + Arrays.toString(data) +
        ", size=" + size +
        '}';
    }

    public static void main(String[] args) {
       CustomArrayList list = new CustomArrayList();
       list.add(3);
       list.add(5);
       list.add(9);

       for (int i = 0; i < 14; i++) {
        list.add(2*i);
       }
       System.out.println(list);
    }


}
