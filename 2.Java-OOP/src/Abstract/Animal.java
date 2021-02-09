package Abstract;

abstract class Animal {
    // soyut sınıfımız
    // hayvanlar farklı sesler çıkarabilir, her nesne için bu metodun işlevi değişecektir.
    abstract void sound();

    public void sleep(){
        System.out.println("Sleeps...");
    }
}
