package Exceptionserrors;

import exceptions.PatientException;

import java.rmi.UnexpectedException;

public class Patience {

    private int sNo;
    private String name;

    public Patience() {
    }

    public Patience(int sNo, String name) {
        this.sNo = sNo;
        this.name = name;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updatePatient() throws UnexpectedException {

        throw new UnexpectedException("not implemented will implemetn later");
    }
    public void editPatient(){

    }
    public void addPatient(){

    }

    public void getPatient(){
Patience p1 = null;
if(p1 ==null){
    throw new  PatientException("varun is trying to thriw an error");
}
    }

    @Override
    public String toString() {
        return "Patience{" +
                "sNo=" + sNo +
                ", name='" + name + '\'' +
                '}';
    }
}
