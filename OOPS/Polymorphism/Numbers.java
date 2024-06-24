package OOPS.Polymorphism;

public class Numbers {

    double sum(double a , int b){
        return a+b;
    }
    double sum(int a , int b){
        return a+b;
    }

    double sum(int a , int b ,int c){
        return a+b+b ;
    }
    public static void main(String[] args) {
        
        Numbers obj = new Numbers();

        obj.sum(3.567, 7);
        obj.sum(8, 9);
    }
}
