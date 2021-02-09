package Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class DefinitionOfStream {
    public void definition(){
        //STREAM OLUSTURMA
        //stream.of(x,x,x): şu objelerden stream oluştur demektir
        Stream<Integer> stream = Stream.of(1,3,5,7,9);
        //stream.count(): stream'in kç elemanlı olduğunu gösterir
        //stream.distinct(): tekrarlı olan değerler tekilleştirilir
        //stream.filter(): filtreleme yapılır
        //stream.findFirst(): ilk eleman bulunur
        //stream.forEach(): döngü oluşturulur
        //stream.sorted(): sıralama yapılır
        //stream.toArray(): obje diziye dönüştürülür
        //stream.toString(): obje String'e dönüştürülür
        //stream.unordered(): sırasız şekilde ekler

        // Lambda ifadeleri ile for ile yapılacak birçok şey yapılabilir
        // Lambda ifadelerinin yazımı
        // parametre ->  ifademiz
        //(ilk_parametre, ikinci_parametre) -> ifademiz
        // parametre / parametreler -> { . . . kod blokları . . .}

        stream.forEach(sayi -> {
            System.out.println(sayi);
            System.out.println("Sayı ekrana girildi");
        });

        // Stream'ler yalnızca bir defa kullanıldığı için farklı işlemlerde farklı stream'ler oluşturduk.
        //Stream'in diziler ile kullanımı
        // sıralamak için aşağıdaki şekilde kullanılır:
        Integer[] sayilar = {10, 2, 4, 6, 22, 75, 1};
        Stream<Integer> stream1 = Stream.of(sayilar);
        stream1.sorted().forEach(sayi -> System.out.println(sayi));

        //Comparator ile sıralama koşulu eklenebilir. Aşağıdaki komut büyükten küçüğe sıralar
        Stream<Integer> stream2 = Stream.of(sayilar);
        stream2.sorted(Comparator.reverseOrder()).forEach(sayi -> System.out.println(sayi));
    }
}
