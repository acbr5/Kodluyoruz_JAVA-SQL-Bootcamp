package Generics;

public class Motorcyle extends Vehicle {

    private String color;

    private String name;

    public Motorcyle(){
        this.color = "Mor";
    }

    public void move(){
        System.out.println("Motorsiklet hareket eder.");
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

}
