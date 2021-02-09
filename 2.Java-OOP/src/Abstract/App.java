package Abstract;

import Abstract.Animal;
import Abstract.Cat;

public class App {
    public static void main(String[] args) throws Exception{
        // Abstract sınıflardan nesne türetilemez:
        // Abstract.Animal animal = new Abstract.Animal(); // hata verir
        // Abstract.Cat obj = new Abstract.Cat();
        Animal obj = new Cat();

        obj.sound();

        obj.sleep();
    }
}