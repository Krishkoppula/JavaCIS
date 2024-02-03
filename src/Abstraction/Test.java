package Abstraction;

abstract class A {
    abstract void JavaClass(String S1); // abstract Method
    abstract void JavaClass1();// abstract Method


    void display(){
        System.out.println("Display the Hidden Method");
    }
}

 class B extends A{

     @Override
     void JavaClass(String S1) {
         System.out.println("Class Instructor name is: "+S1);
     }

     @Override
     void JavaClass1() {

     }
 }
public class Test{
    public static void main(String[] args){
        A P1 = new B();
        P1.JavaClass("Kasi");

    }

}
