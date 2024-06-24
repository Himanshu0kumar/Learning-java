package OOPS.AbstractDemo;

public abstract class Parent {

    int age ;

    final int VALUE ;

    // can we create a construtor of an abstract class - yes it allow and we can call this consturtor via the super keyword
    public Parent(int age) {
        this.age = age ;
        VALUE = 342454;
    }
    // the static method can be created in abstract class 
    static void hello(){
        System.out.println("Hey");
    }
    // the abstract class also cantain normal methods 

    void normal(){
        System.out.println("This is the normal methods");
    }
    abstract void career();
    abstract void partner();
}
