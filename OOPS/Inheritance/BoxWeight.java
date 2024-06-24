package OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight ;

    public BoxWeight(){
        this.weight = -1 ;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight ;
    }

    BoxWeight(double side , double weight){
        super(side); // it will call the Box and it should have a constructor that takes one Argument
        this.weight = weight ;
    }

    public BoxWeight(double l , double w , double h , double weight){
        super(l , w , h);           // call the parent class constructor 
        // use to initialize values present in parent class 
    
        System.out.println(super.weight);

        this.weight = weight ;
    }
}
