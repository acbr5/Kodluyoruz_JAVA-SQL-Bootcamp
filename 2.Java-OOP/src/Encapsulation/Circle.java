package Encapsulation;

public class Circle {
    //constant (sabit) sayılar için kullanılır.
    private static final double pi = 3.1415;

    private double radius;
    private String color;

    //Yapıcı metotlar sınıfla aynı isme sahip olmalıdır
    Circle(){
        radius = 2.0;
        color = "blue";
    }

    //Overloading (aşırı yüklenme) yapılan metot
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //Overloading (aşırı yüklenme) yapılan metot
    Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius(){
        return radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public void setArea(double r){
        this.radius = r;
    }
}
