package OOPS;

public class Basic {

    public static void main(String[] args) {

        // store 5 roll nos

        // int[] numbers = new int[5];

        // store 5 names

        // String[] StudentName = new String[5];

        // data of 5 studens :{roll no , name , marks}

        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] mark = new float[5];

        // Student[] students = new Student[5];

        // just declaring

        Student Himanshu = new Student();  // this is calling the function 

        System.out.println(Himanshu.Name);

        Himanshu.changeName("Rohit sharma");

        Himanshu.Greating() ;

        
        Student random = new Student(Himanshu);
        System.out.println(random.Name);


        // Final key word in primitive datatypes 

        //  final int num =  8 ; 
        //  num = 10 ;          // it can't be reassigned 

        final A sona = new A("Himanshu kumar of class A"); 
        sona.name = "other name";
        // sona = new A("new object");  // this can't do 

        
        // A obj ; 

        // for (int i = 0; i < 10000; i++) {
        //     obj = new A("Random name");
        // }
    }
}

// Creating a class

class Student {
    int RollNo;
    String Name;
    float marks;

    void Greating (){
        System.out.println("Hello! my Name is "+this.Name);
    }

    void changeName (String newName){
        this.Name = newName;
    }

     // this is the constructor :- which also known as special function 

    Student (){
        this.RollNo = 112 ;
        this.Name = "Himanshu kumar";
        this.marks = 78.5f;
    }

    // same function only passing the Arguments 

    Student (int RollNo , String Name , float marks){
        this.RollNo = RollNo;
        this.Name = Name ;
        this.marks = marks ;
    }

    // Creating an other constructor 

    Student (Student other) {
        this.Name = other.Name ;
        this.RollNo = other.RollNo;
        this.marks = other.marks ;
    }

}

// final key words inside class 
class A {
    final int num = 10 ; 
    String name ;

    public A(String name){
        this.name = name ;
    }
    @Override 
    protected void finalize() throws Throwable {
        System.out.println("The  Object is destoryed");
    }
}

