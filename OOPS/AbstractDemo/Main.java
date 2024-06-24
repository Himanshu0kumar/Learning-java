package OOPS.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        son.career();

        Daughter daughter = new Daughter(0);
        daughter.career();

        son.normal();

        Parent.hello();

        // you can't create object of an abstract class if you are able to create an 
        // abstract class and you try to call careen one and it will give an error because
        // it does not have any body  
        // Parent mom = new Parent() ;
    }
}
