import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        System.out.println(list);

        Collections.sort(list);

        int[] arr = {5 , 2 ,7 , 1 ,3};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        
    }
}
