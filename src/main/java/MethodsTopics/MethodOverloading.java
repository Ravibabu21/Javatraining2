package MethodsTopics;

public class MethodOverloading {
    public MethodOverloading(){
        // this is constuctor
    }
static void car(String model){
    System.out.println("this car brand is "+model);
}
public void bike(int topSpeed){
    System.out.println("this bike int topspeed is "+topSpeed);
}
public void bike(double topSpeed){
        System.out.println("this bike double topspeed is "+topSpeed);
    }
    public void bike(int topSpeed,String model){ //method overloading, two parameters
        System.out.println("this bike String topspeed is "+topSpeed+" "+model);
    }
    public static void main(String[] args) {
        //this is block of code
        car("Audi"); // method calling
        MethodOverloading obj=new MethodOverloading(); // object creation
        obj.bike(450,"Dukati");
    }
}
