package Solid.DependencyInversion.right;

public class App {

    public static void main(String[] args) throws Exception{
        ICanChange lamp = new Lamp();
        IButton lampButton = new PowerButton(lamp);
        lampButton.press();
        lampButton.press();

        ICanChange clima = new Clima();
        IButton climaButton = new PowerButton(clima);
        climaButton.press();
        climaButton.press();

    }

}
