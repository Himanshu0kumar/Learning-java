package OOPS.access;

public class SubClass extends A {
    
    public SubClass(int num , String name){
        super(num , name); 
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Himanshu kumar");
        int n = obj.num ; // when num is protected stil we can in the sub class of the same package 
        
    }
}
