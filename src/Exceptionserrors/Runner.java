package Exceptionserrors;

import java.rmi.UnexpectedException;

public class Runner {


    public static void main(String[] args) throws UnexpectedException {
        Patience p = new Patience(1,"varun");
        System.out.println(p);
       // p.getPatient();
        p.updatePatient();

    }
}
