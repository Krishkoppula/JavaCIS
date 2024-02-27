package Abstraction;
interface ITest{
    void updateEmployeeInfo();
}
public interface IEmpolyee {
    public static final String S1="Krishna";
    default void employeeDetails(){
        System.out.println("Default Method");
    }
    void updateEmployeeInfo();
    void getEmployeeInfo();
    void deleteEmployeeInfo();

}
class John implements IEmpolyee,ITest{
//class John extends Test3 implements IEmpolyee,ITest for Class and Inerface
    @Override
    public void updateEmployeeInfo() {
        System.out.println("Bad");

    }

    @Override
    public void getEmployeeInfo() {
        System.out.println("Awesome");
    }

    @Override
    public void deleteEmployeeInfo() {
        System.out.println("good");
    }
}
