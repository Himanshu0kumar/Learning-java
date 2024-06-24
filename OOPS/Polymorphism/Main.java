package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args){

        // cerating the objects 

        // Shape shape = new Shape();
        // Circle circle = new Circle();
        // Traingle traingle = new Traingle();
        // Square square = new Square();

        // accessing those objects 

        // shape.area();
        // square.area();
        // circle.area();
        // traingle.area();

        // Overriding 
        // it does not  depends on object type it depends on reference type only 
        // and reference type should hava an area()

        // Shape shape = new Shape(); 
        Shape circle = new Circle();

        circle.area();

    }
}
