package exceptions;

public class PatientException extends RuntimeException{


    public PatientException(){

    }
    public PatientException(String errorMessage){
        super(errorMessage);
    }


}
