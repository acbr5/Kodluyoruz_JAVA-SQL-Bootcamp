package Solid.DependencyInversion.right;

public class Clima implements ICanChange{

    @Override
    public void open() {
        System.out.println("Klima açıldı.");
    }

    @Override
    public void close() {
        System.out.println("Klima kapanoı.");
    }

}
