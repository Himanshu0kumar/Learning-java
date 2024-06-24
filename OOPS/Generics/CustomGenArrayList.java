package OOPS.Generics;
import java.util.Arrays;
public class CustomGenArrayList<T> {
    private Object[] data ;
    private static int DEFAULT_SIZE = 10 ;
    private int size = 0 ;      // also working as a index value  

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    // Adding elements in the ArrayList 
    public void add(T num){
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
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new Array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data= temp ;
    }

    // removing the elements 
    public T remove(){
        T removed = (T)(data[--size]);  // decrease the size by 1 
        return removed ;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size ;
    }
    public void set(int index , T value){
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

    //    for (int i = 0; i < 14; i++) {
    //     list.add(2*i);
    //    }

    //    System.out.println(list);

    CustomGenArrayList<Integer> list2 = new CustomGenArrayList<>();

        for (int i = 0; i < 14; i++) {
            list2.add(2 * i);
        }
        System.out.println(list2);
    }
}
