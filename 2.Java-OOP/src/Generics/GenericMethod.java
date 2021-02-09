package Generics;

//Jenerik metot oluşturalım
//Eleman listesi belirtirken genellikle E kullanılır
public class GenericMethod {

    public static <E> void degerleriGoster(E[] degerler){
        for (E deger : degerler) {
            System.out.println("Değer: "+deger);
        }
    }
}
