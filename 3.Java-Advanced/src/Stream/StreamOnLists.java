package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOnLists {
    List<Integer> sayilar;

    StreamOnLists(){
        sayilar = new ArrayList<>();
    }

    public void streamOnLists(){
        //Stream'i Listeler ile Kullanma
        for(int i=0; i<6; i++){
            sayilar.add(i);
        }

        //Stream ile listeler üzerinde de işlem yapılabilir
        Stream<Integer> stream = sayilar.stream();

        System.out.print("2'ye bölünebilen sayılar: ");
        //filter ile sonuçlar filtrelenebilir. Aşağıda 2'ye tam bölünebilen sayılar yazdırılmıştır:
        stream
                .filter(sayi -> sayi %2 ==0)
                .forEach(sayi -> System.out.println(sayi));

        System.out.print("K ile başlayan Elemanlar: ");
        //String Stream
        Stream<String> streamStr = Stream.of("Elma", "Armut", "Kiraz");

        streamStr.filter((str) -> str.startsWith("K"))
                .forEach(str -> System.out.println(str));

        System.out.print("Elemanların büyük harfe çevrilmesi: ");
        //Map belirli özellikleri tüm elemanlara uygulamak için kullanılır. Örneğin aşağıdaki örnekte stream'in tüm elemanlarını büyük harfe çevirir.
        Stream<String> strStream = Stream.of("Elma", "Armut", "Kiraz");

        strStream.map(str -> str.toUpperCase(Locale.ROOT))
                .forEach(str -> System.out.println(str));

        System.out.println("\n");
        //
        Stream<String> streamStr2 = Stream.of("Elma", "Armut", "Kiraz", "Kivi", "Karpuz");
        List<String> upperCaseFruits = streamStr2.sorted()
                                                .map(str -> str.toUpperCase(Locale.ROOT))
                                                .collect(Collectors.toList());
        System.out.println(upperCaseFruits);

        System.out.println("\n");
        //listenin stream özelliği çağırılarak da stream'den faydalanılabilir.
        System.out.print("K ile başlayan elemanların sayısı:");
        long totalFruits = upperCaseFruits.stream()
                .filter(fruit -> fruit.startsWith("K"))
                .count();

        System.out.println(totalFruits);


        //Listenin sınırlı sayıda elemanını göstermek için:
        Stream<String> streamStr3 = Stream.of("Elma", "Armut", "Kiraz", "Kivi", "Karpuz");
        List<String> upperCaseFruits2;

        System.out.print("Listedeki ilk 4 eleman: ");
        List<String> limitedFruits = streamStr3
                                    .limit(4)
                                    .collect(Collectors.toList());
        System.out.println(limitedFruits);


        //
        Stream<String> fruits = Stream.of("Elma", "Armut", "Kiraz", "Kivi", "Karpuz", "Erik", "Kayısı", "Elma", "Kiraz");
        List<String> fruitList = fruits.collect(Collectors.toList());

        // Stream'den sadece tek bir eleman çekilecekse onun türü Optional olarak geçer.
        // findAny() Stream içindeki herhangi bir elemanı seçer.
        Optional<String> fruit = fruitList.stream()
                                           .filter(meyve -> meyve.startsWith("K"))
                                           .findAny();
        System.out.print("Herhangi bir Eleman: "+fruit.get());

        // herhangi bir eleman var mı: fruit.isPresent()
        // böyle bir koşula uyan değer var mı sorusunun daha kolayı: boolean match = fruitList.stream().anyMatch(meyve -> meyve.startsWith("A"));
        // bütün elemanlar için kontrol: boolean matchAll = fruitList.stream().allMatch(meyve -> meyve.startsWith("A"));
        // boolean matchNone = fruitList.stream().noneMatch(meyve -> meyve.startsWith("A"))

        System.out.println("\n");
        //findFirst() listenin ilk elemanını bulur.
        Optional<String> fruit2 = fruitList.stream().findFirst();

        System.out.print("İlk eleman: "+fruit2.get());


        System.out.println("\n");
        //distinct: Tekrar eden verileri teke düşürür
        List<String> fruit3 = fruitList.stream().distinct().collect(Collectors.toList());

        System.out.print("Tekrar eden verilerin silinmiş hali: "+fruit3);
    }
}