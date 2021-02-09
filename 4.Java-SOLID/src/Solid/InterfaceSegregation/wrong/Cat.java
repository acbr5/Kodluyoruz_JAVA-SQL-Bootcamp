package Solid.InterfaceSegregation.wrong;

public class Cat implements IAnimal {

    // Kediler uçamaz ve havlayamaz, koşabilir ayrıca miyavlamalıdır.

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void bark() {

    }
}
