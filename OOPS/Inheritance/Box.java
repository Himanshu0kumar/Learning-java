package OOPS.Inheritance;

public class Box {
    double l;
    double w;
    double h;
    double weight;

    // this is a constructor
    Box() {
        this.l = -1 ;
        this.h = -1 ; 
        this.w = -1 ;
        double weight ;
    }

    // cube this is an other consturctor
    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double h, double w, double l) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(BoxWeight other) {
        
    }

    void Box(Box old) {  // copy the constructor  
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }

}
