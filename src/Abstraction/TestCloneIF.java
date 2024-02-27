package Abstraction;

class Employee3 {
    public String Emp_name;
    public String Address;
    public int emp_id;

    public  Employee3(String Emp_name,String Address,int emp_id){
        this.Emp_name=Emp_name;
        this.Address=Address;
        this.emp_id=emp_id;
    }
}


public class TestCloneIF {
    public static void main(String[] args){
        Employee3 Emp_1= new Employee3("Krishna","FL",123);
        //Cloneable Interface Example

    }
}
