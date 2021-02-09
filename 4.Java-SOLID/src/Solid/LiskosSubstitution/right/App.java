package Solid.LiskosSubstitution.right;

// bisikletin motoru olmadığı ve üst sınıfta motor metodu olduğu için yanlış hiyerarşi yapıldı.
// bisiklet, ulaşım aracı sınıfındaki tüm özellikleri ve metotları karşılamamaktadır.
// motorsuz ve motorlu olan ulaşım araçlarını farklılaştırmalıyız.


public class App {

    public static void main(String[] args) throws Exception{
        Car car = new Car();
        car.startMotor();

        Bicycle bicycle = new Bicycle();
        bicycle.move();
    }

}
