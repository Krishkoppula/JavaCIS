public class Employee1 {
        int empid =1234;
        String Emp_name;
        String Role;
        String Department;

        public void Display_info(){
            System.out.println(empid);
            System.out.println(Emp_name);
            System.out.println(Role);
            System.out.println(Department);
        }
        public static void main(String[] args){
            System.out.println("Main Method is Running");
            Employee1 Emp_1 = new Employee1();
        /*Emp_1.empid;
        Emp_1.Department;
        Emp_1.Emp_name;*/
            String Role1=Emp_1.Role;
            Emp_1.Display_info();
        }
    }

