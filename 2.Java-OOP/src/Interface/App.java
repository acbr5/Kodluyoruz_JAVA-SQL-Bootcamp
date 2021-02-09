package Interface;

public class App {
    public static void main(String[] args){
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.sinavaGir();

        //Interface'ler sınıf değildir
        //Interface'lerde normal metot tanımlanamaz, hepsi abstract olmak zorundadır
        //interface'lerden nesne türetilemez
        //KursUyesi obj = new KursUyesi(); // hata verir

        Horse horse = new Horse();
        horse.ride();
    }
}
