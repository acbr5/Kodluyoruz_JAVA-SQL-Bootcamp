package Generics;

public class Vehicle {

    private String name;

    public Vehicle(){
        this.name = "Araç";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void move(){
        System.out.println("Araçlar hareket eder.");
    }
}
