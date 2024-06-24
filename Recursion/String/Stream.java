
// The question is Remove 'a' from the given String 

public class Stream {
    public static void main(String[] args) {
        // skiped("", "baccdah");

        // System.out.println(skip("baccdah")); 

        System.out.println(skipApple("baccappledah"));
    }
    // method - 1 
    static void skiped(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            skiped(p , up.substring(1));
        }
        else{
            skiped(p + ch, up.substring(1));
        }

    }

    // method - 2 

    static String skip(String up){
        if(up.isEmpty()){
            return "" ;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }

    // Remove words like "apple" from the given String 

    static String skipApple(String up){
        if(up.isEmpty()){
            return "" ;
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
