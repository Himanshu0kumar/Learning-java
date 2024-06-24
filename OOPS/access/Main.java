package OOPS.access;


public class Main {
    public static void main(String[] args) {
        A obj = new A(112 , "Himanshu");

        // needs to do a few things 
        // 1. access the data members
        // 2. modify the data members 

        // obj.num   // directly we can't access because it is private 

        obj.getNum();
        
    }
}
