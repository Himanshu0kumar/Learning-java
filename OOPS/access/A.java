package OOPS.access;

public class A {
   protected int num ; // can't access the data directly due to security reason use getter and setter methods
    String name ;
    int[] arr ; 

    // we can access private variable via getter and setter 

    // getter - gets the value 
    public int getNum(){
        return num;
    }

    // setter - update or set the value 
    // this method is public so that it can be access anywhere 
    public void SetNum(){
        this.num = num ;
    }
    // creating a constructor 
    public A(int num , String name ){
        this.num = num ;
        this.name = name ;
        this.arr = new int[num];
    }
}
