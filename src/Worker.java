import java.util.function.DoubleToIntFunction;

public class Worker {
    String name;
    double phone;
    String group;

    public Worker(){
        this.Worker();
        System.out.println("Inside the Constructor");
    }

    public Worker(String name,double phone , String group ){
        this("Black");
        System.out.println("Inside the Constructor");
        this.name=name;
        this.phone=phone;
        this.group=group;
        System.out.println("Constructor with Three parameter");

    }
    public void Worker(){
        System.out.println("Function for the Worker Class");
    }
    public Worker(String group){
        this.Worker();
        System.out.println("Constructor with one parameter");
    }

    public static void main (String[] args){
        Worker W_one= new Worker("Krishna",281236,"Red");
        Worker W_two= new Worker("Yellow");
        System.out.println(W_one.name);
        System.out.println(W_one.phone);
        System.out.println(W_one.group);
        System.out.println("End for Constructors");
    }
}
