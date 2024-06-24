import java.util.HashMap;
import java.util.Map;

public class Question {
    public static void main(String[] args) {
        firstRep("abbbcddd");
    }
    static char firstRep(String s)
    {
        // your code here
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;
            map.put(ch,map.getOrDefault(ch,0) + 1) ;
        }
        for(Character c:map.keySet()){
            System.out.print(c +"->"+map.get(c)+ ", "  );
            if(map.get(c)>1){
                System.out.println();
                return c;
            }
        }
        return '\0';
    }
}
