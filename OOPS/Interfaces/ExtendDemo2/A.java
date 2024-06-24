package OOPS.Interfaces.ExtendDemo2;

public interface A  {
    
   // The static interface methods should always hava a body ....
   static void greet(){
      System.out.println("Hey I am static method ");
   }
   default void fun(){
      System.out.println(" I am in A ");
   }
}
