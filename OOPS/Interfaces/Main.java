package OOPS.Interfaces;

public class Main {
    public static void main(String[] args){

        // Car car = new Car() ;  Normal methods to creating objects 

        // Engine car = new Car();

        // car.a;   // not able to access it 
        // car.acc();
        // car.start();
        // car.stop();

        /*Note - if you want to stop music but it stop the engine
       so that we create a ceperate class for these interfaces as well
       */
        // Media carMedia = new Car();
        // carMedia.stop();   


        NiceCar car = new NiceCar();

        car.start();  // powerEngine will start 
        car.startMusic();
        car.upgradeEngine(); // without cerating a new object you are able to change the  part of the engine 
        car.start();  // now the ElectricEngine will start 
    }
}
