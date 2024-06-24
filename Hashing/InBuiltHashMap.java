
import java.util.HashMap;
import java.util.Map;
public class InBuiltHashMap {
    public static void main(String[] args) {
        // Country (key) , population(value)
        HashMap<String , Integer> map = new HashMap<>(); // empty HashMap is created 

        // insertion  
        map.put("India", 120);
        map.put("china", 150);
        map.put("America",30);
        map.put("India",20); // it will update the value of India key 

        System.out.println(map);
        // search / loopup 

        if(map.containsKey("china")){
            System.out.println("Present in the map");
        }
        else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("Indonesia"));

        //  use the enhance for loop 

        int[] arr = {12 , 18 , 20};
        
        for (int val : arr) {
            System.out.print(val +" ");
        }
        System.out.println();

        // Iterator in hashmap 

        for (Map.Entry<String,Integer> mapElement : map.entrySet()) {
            String key = mapElement.getKey();
 
            // Adding some bonus marks to all the students
            int value = (mapElement.getValue() + 10);
 
            // Printing above marks corresponding to
            // students names
            System.out.println(key + " : " + value);
        }

        // remove any key and value for the map 

        map.remove("china");
        System.out.println(map);


        // update the value of keys in the hashmap 

        // if(!map.containsKey(key)){
        //     map.put(key,1);
        // }else{
        //     map.put(key,map.get(key)+1);
        // }

        // Other way to update the value of keys is 

        // map.put(key,map.getOrDefault(key, 0) + 1 );
    }
}
