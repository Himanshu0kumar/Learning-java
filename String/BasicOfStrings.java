package String;
import java.util.*;
public class BasicOfStrings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // to decalare a strings in java 
        String name = "Himanshu";

        // To take a strings from the user

        String user = in.nextLine();


        // to Concatenation a strings use the + 

        String fullName = name + " " + user ;

        System.out.println(fullName);

        // to find the length of the strings 
         System.out.println(fullName.length());

        // charAt is use to find the indeces
        for(int i = 0 ; i < fullName.length(); i++){

            System.out.print(fullName.charAt(i) + " ");
        }

        // compare a strings 
        /* string-1 > string-2  : +ve
           string-1 < string-2  : -ve 
           string-1 == string-2  : 0
         */
        if(name.compareTo(user)==0){
            System.out.println("The strings are equal");
        }
        else{
            System.out.println("The string are not equal");
        }

        // substring(starting index , ending index )
        String sentence = "My name is Himanshu kumar";
        System.out.println(sentence.substring(15 , sentence.length()));
        in.close();
    }
}
