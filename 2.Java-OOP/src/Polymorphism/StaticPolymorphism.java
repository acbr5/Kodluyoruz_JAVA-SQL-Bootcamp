package Polymorphism;

// Statik Polimofizm
public class StaticPolymorphism {
    public int add(int x, int y){
        return x+y;
    }

    public int add(int x, int y, int z){
        return x+y+z;
    }

    public int add(double x, int y){
        return (int) x+y;
    }

    public int add(int x, double y){
        return x+(int)y;
    }

    public static void main(String[] args){
        StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
        int sonuc1 = staticPolymorphism.add(5,10);
        int sonuc2 = staticPolymorphism.add(3,4,6);
        int sonuc3 = staticPolymorphism.add(15.6,7);
        int sonuc4 = staticPolymorphism.add(1,8.4);
    }
}
