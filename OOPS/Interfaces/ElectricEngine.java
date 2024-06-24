package OOPS.Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electirc engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void acc() {
       System.out.println("Electirc engine accelerate");
    }
    
}
