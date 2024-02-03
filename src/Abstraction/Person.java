package Abstraction;

public class Person {
    private static int a=10;
    private void walk(){
        System.out.println("Person can Run");
    }
    protected void eat(){
        System.out.println("Person can Eat ");
    }

}
class Employee extends Person{
    void walk(){
        System.out.println("Employee can Run");
    }
    void Sleep(){
        System.out.println("Employee can Sleep");
    }
}
class test{
    public static void main(String[] args){
        Person P1=new Person();
        P1.eat();
        //P1.walk();
        Employee Emp1=new Employee();
        Emp1.walk();
        Emp1.Sleep();

    }
}