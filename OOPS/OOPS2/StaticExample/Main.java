package OOPS.OOPS2.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Himanshu = new Human(22 , "Himanshu" ,10000 , false);
        Human Rahul = new Human(22 , "Rahul" , 15000 , false);
        Human Mahesh = new Human(22 , "Mahesh" , 15000 , false);


        // System.out.println(Himanshu.name);
        System.out.println(Human.population);
        
        // greeting();
    }

    // this is not dependent on the objects
    static void fun(){
        // greeting(); // you can not use this because it requires an instance 
                    // but the function you are using it does not depends on instances

        // it will work when we create an object and then call it 

        // Main obj = new Main(); // created a object 
        // obj.greeting();
    }
    // we know that something which is not static , belong to the Objects 
    void greeting(){
        System.out.println("Hello world");
        // we can use the static things inside a non-static things 
        fun();
    }

}
