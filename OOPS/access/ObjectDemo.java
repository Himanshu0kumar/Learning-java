package OOPS.access;

public class ObjectDemo {

    int num ;
    float gpa ;

    public ObjectDemo(int num , float gpa){
        this.num = num ;
        this.gpa = gpa;
    }
    @Override
    // it gives the random uniquic number not address
    public int hashCode (){

        // return super.hashCode();
        return num ;
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return super.toString();
    }
    @Override 
    protected void finalize () throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34 , 72.49f);
        ObjectDemo obj2 = new ObjectDemo(54 , 74.5f);
        // ObjectDemo obj2 = obj ;

        if(obj1 == obj2){
            System.out.println("obj is equal to obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equl to obj2");
        }

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
