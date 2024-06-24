package OOPS.Generics;

import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        // it will print the twice of the every elements 
        list.forEach((item) ->System.out.println(item *2));
    }
    int sum(int a , int b){
        return a+b;
    }
}
