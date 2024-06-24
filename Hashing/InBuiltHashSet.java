

import java.util.HashSet;
import java.util.Iterator;

public class InBuiltHashSet {
    public static void main(String[] args) {
        // Creating 
        HashSet<Integer> set = new HashSet<>();

        // inseting 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // size of set 
        System.out.println("The size of set is " + set.size());

        // print all Elements 
        System.out.println(set);
        // search / contains 

        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contains 6");
        }

        // Delete elements 
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }

        // Iterator - to use the iterator we have to import the java.util.Iterator
        
        Iterator it = set.iterator();

        // Iterator has to function 
        //1. hasNext  2. next 

        while(it.hasNext()){
            System.out.println(it.next());    
        }
    }
}
