package Solid.LiskosSubstitution.wrong;

public class Bicycle extends TransportVehicle{

    // bisikletin motoru olmadığı ve üst sınıfta motor metodu olduğu için yanlış hiyerarşi yapıldı.
    // bisiklet, ulaşım aracı sınıfındaki tüm özellikleri ve metotları karşılamamaktadır.
    // motorsuz ve motorlu olan ulaşım araçlarını farklılaştırmalıyız.

    @Override
    void startMotor(){

    }

}
