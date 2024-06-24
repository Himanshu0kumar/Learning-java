package OOPS.Constructors;

// it is a class 
public class Geeks {

    String name;
    int id;

    // it is constructor
    // it is also example of the default constructor
    Geeks() {
        super();
        System.out.println("this is the constructor");
    }

    // parameterized constructor

    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Geeks(Geeks obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }

    // this is the main function
    public static void main(String[] args) {
        Geeks geeks = new Geeks();

        Geeks geek1 = new Geeks("Avinash", 68);
        System.out.println("GeeksName :" + geek1.name
                + " and GeeksId :" + geek1.id);

        System.out.println();

        // This would invoke the copy constructor.
        Geeks geek2 = new Geeks(geek1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("GeekName :" + geek2.name
                + " and GeekId :" + geek2.id);
    }
}
