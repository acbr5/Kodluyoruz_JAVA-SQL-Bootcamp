package Collections;

import java.util.*;

public class Colllections {

    Map<String, Integer> map;

    public void list(){
        //Sıralı yapılar için List kullanılır.
        List<Integer> liste = new ArrayList();
        liste.add(45);
        liste.add(19);
        liste.add(15);
        liste.add(19);
        for (Integer eleman: liste) {
            System.out.println(eleman);
        }
        System.out.println();
    }

    public void set(){
        //Set küme listesidir. HashSet sınıfından çağırılır. Listeden farkı birden fazla tekrar eden verileri göstermez ve sıralı şekilde değil karışık şekilde ekler.
        Set<Integer> kume = new HashSet<>();
        kume.add(5);
        kume.add(19);
        kume.add(15);
        kume.add(19);

        for (Integer eleman: kume) {
            System.out.println(eleman);
        }
        System.out.println();
    }

    public void map(){
        //her biri birbirinden farklı anahtar ile eşleştirilmiş nesnelerdir.
        map = new HashMap<>();
        map.put("birinci_sayi",10);
        map.put("ikinci_sayi",61);
        map.put("ucuncu_sayi",7);
        map.put("dorduncu_sayi",21);

        System.out.println("#Anahtarsız Listeleme: ");
        // ikinci girdiler (10,61,7,21) value olarak geçer.
        for (Integer eleman: map.values()) {
            System.out.println(eleman);
        }

        System.out.println("#Anahtarla Listeleme:");
        //hem anahtar hem değerleri yazdırmak için:
        for (Map.Entry<String,Integer> eleman: map.entrySet()) {
            System.out.println(eleman.getKey() + " : " + eleman.getValue());
        }
        System.out.println();

        // Map'i sayılara göre sıralamak için:
        // values() yerine keySet() de yazılabilir
        System.out.println("Value değerlerine göre sıralama: ");
        List<Integer> sayilar = new ArrayList<>(map.values());
        Collections.sort(sayilar);

        for (Integer sayi: sayilar) {
            System.out.println(sayi);
        }

        System.out.println();
    }

    public void treeMap(){
        //normal map gibidir fakat sıralanmış şekildedir
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("birinci_sayi",10);
        sortedMap.put("ikinci_sayi",61);
        sortedMap.put("ucuncu_sayi",7);
        sortedMap.put("dorduncu_sayi",21);

        // yukarıdaki işlem şu şekilde de yapılabilir: map'in hepsini tek komutta ekler
        // sortedMap.putAll(map);

        for (Map.Entry<String,Integer> eleman: sortedMap.entrySet()) {
            System.out.println(eleman.getKey() + " : " + eleman.getValue());
        }
    }
}