package Abstraction;

abstract class A {
    abstract void javaClass(String s1);
    abstract void javaClass1();

    void display() {
        System.out.println("Display the Hidden Method");
    }
}

class B extends A {

    @Override
    void javaClass(String s1) {
        System.out.println("Class Instructor name is: " + s1);
    }

    @Override
    void javaClass1() {
        System.out.println("JavaClass1 method in class B");
    }
}

class C extends B {
    // This method overloads the display() method from A but does not override it
    void display(String s2) {
        System.out.println("Display Class C: " + s2);
    }
}

public  class abstractTest{
    public static void main(String[] args) {
        A p1 = new B();
        p1.javaClass("Kasi");
        p1.display(); // This will call the display method from A

        C p2 = new C();
        p2.javaClass("Krishna");
        p2.display("Reddi"); // This calls the overloaded display method in C
        p2.display(); // This will call the inherited display method from A
    }
}



