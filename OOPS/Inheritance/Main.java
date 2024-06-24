package OOPS.Inheritance;



public class Main {
    public static void main(String[] args) {
        // Box box = new Box();    //  this constructor takes nothing arguments 
        // Box box = new Box(4);       // this constructor takes one arguments only 
        Box box = new Box(4.6 , 7.9 , 9.9);
        System.out.println(box.l +" "+ box.h + " "+ box.w);

        // BoxWeight box3 = new BoxWeight(2 , 3 , 4 , 8);
        // System.out.println(box3.h+ " " + box3.weight);

        Box box5 = new BoxWeight(2 ,3 ,4 ,8);
        System.out.println(box5);

        // BoxWeight box6 = new Box(2 , 3 , 4);         it throw an error 
        // System.out.println(box6);
    }
}
