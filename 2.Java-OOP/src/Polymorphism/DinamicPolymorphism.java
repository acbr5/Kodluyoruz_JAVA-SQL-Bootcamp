package Polymorphism;

public class DinamicPolymorphism {
    public void move(){
        System.out.println("Araç hareket eder");
    }
}

class Motorsiklet extends DinamicPolymorphism{
    public void move(){
        System.out.println("Motorsiklet hareket eder");
    }
}