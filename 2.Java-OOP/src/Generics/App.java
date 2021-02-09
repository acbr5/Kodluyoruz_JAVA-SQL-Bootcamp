package Generics;

import java.util.ArrayList;

// Parametleştirilmiş tipler anlamına gelir.
// Ana fikri, referans veri tiplerinin metotlara, sınıflara ve interface'lere parametre olarak geçebilmesini sağlamaktır
// Jenerik kullanarak farklı veri tipleri ile çalışan sınıflar oluşturulabilir
// Referans veri tipleri: Integer, String
public class App {

    public static void main(String[] args){
        // Var olan bir jenerik yapısı:
        ExistGenericExample example = new ExistGenericExample();
        example.addList("elma","armut","portakal");
        System.out.println("Eleman: "+example.getElement());

        // Bizim oluşturduğumuz jenerik yapısı:
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Vehicle());
        vehicleList.add(new Vehicle());

        ArrayList<Motorcyle> motorcyleList = new ArrayList<>();

        motorcyleList.add(new Motorcyle());
        motorcyleList.add(new Motorcyle());

        System.out.println();
        showVehicles(vehicleList);
        System.out.println();
        showMotorcyles(motorcyleList);

        //JENERİK SINIF TANIMLANMASI
        System.out.println();
        GenericClass<String> genericClass1 = new GenericClass<>();
        GenericClass<Integer> genericClass2 = new GenericClass<>();

        genericClass1.setDeger("Merhaba Kodluyoruz");
        genericClass2.setDeger(100);

        System.out.println("İlk değer: "+ genericClass1.getDeger());
        System.out.println("İkinci değer: "+ genericClass2.getDeger());

        //JENERİK METOT TANIMLANMASI
        //Metotları statik tanımladığımız için nesne oluşturmadan sınıf ismi ile direkt erişebildik
        System.out.println();
        String[] strings = {"elma", "armut", "çilek"};
        Integer[] integers = {11,22,33,44,55};

        GenericMethod.degerleriGoster(strings);
        GenericMethod.degerleriGoster(integers);
    }

    //<? extends Vehicle> Vehicle'ı miras alan bütün sınıfları buraya yazabilirsin demek
    public static void showVehicles(ArrayList<? extends Vehicle> list){
        for (Vehicle vehicle:list) {
            System.out.println(vehicle.getName());
        }
    }

    public static void showMotorcyles(ArrayList<Motorcyle> list){
        for (Motorcyle motorcyle:list) {
            System.out.println(motorcyle.getColor());
        }
    }
}