package OOPS.Polymorphism;

public class Circle extends Shape{
    //  this will run when obj of he circle is created 
    //  hence it is the override the parent method 
    @Override  //  this is the anotation (check)
    void area (){
        System.out.println("Area is pie *r *r");
    }
}
