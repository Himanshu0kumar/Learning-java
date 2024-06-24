package OOPS.Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Himanshu = new Student(112, 91.65f);
        Student Ashish = new Student(67, 87.65f);
        Student jay = new Student(114, 70.65f);
        Student anup = new Student(56, 90.65f);
        Student Rahul = new Student(170, 85.87f);

        Student[] list = {Himanshu , Ashish , jay , anup , Rahul};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        // here java will confuse that the objects has tow property which you want to compair
        if(Himanshu.compareTo(Ashish)<0){
            System.out.println("Ashish has more mark");
            System.out.println(Himanshu.compareTo(Ashish)); // it will give you actual value 
        }
    }
}
