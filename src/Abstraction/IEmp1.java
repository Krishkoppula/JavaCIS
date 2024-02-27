package Abstraction;

public class IEmp1{
    public static void main(String[] args){
        IEmpolyee j1=new John();
        j1.deleteEmployeeInfo();
        j1.getEmployeeInfo();
        j1.updateEmployeeInfo();
        ITest j2=new John();
        j2.updateEmployeeInfo();
        j1.employeeDetails();
    }
}