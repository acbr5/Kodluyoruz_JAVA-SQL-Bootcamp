package Interface;

public class Horse implements Animal, RideableObject{
    public void sound(){
        System.out.println("At sesi");
    }

    public void sleep(){
        System.out.println("At uyuyor...");
    }

    public void ride(){
        System.out.println("At sürülür");
    }
}
