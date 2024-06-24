package String;
// import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Char at index 0 :) It will show data at index 0
        System.out.println(sb.charAt(0));
        
        // set char at index 0 :) it will chanage the value at index of that 

        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert a new string and shift forword towords 

        sb.insert(0, 'M');
        System.out.println(sb);

        // to delete any string
        sb.delete(0, 1);
        System.out.println(sb);
    }
}
