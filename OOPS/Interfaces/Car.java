package OOPS.Interfaces;

public class Car implements Engine , Break , Media{

    int a = 30 ; 

    @Override
    public void breaks() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I   start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I  stop engine like a normal car");
    }

    @Override 
    public void acc(){
        System.out.println("I accelerate engine like a normal car");
    }
    
}
