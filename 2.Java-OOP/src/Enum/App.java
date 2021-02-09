package Enum;

// Önceden tanımlanmış değerleri ifade etmek için kullanmamımzı sağlar.
// Özel bir sınıf türüdür. Bu sınıf türünde sabit değerler oluşturulur ve sonradan değiştirilemez
// Standart class değil, özelleşmiş class olarak düşünülebilir.
// Sabit değerler kümesi olarak düşünülebilir
// Sabit değerler için bir küme belirtmek ve bunu belirli yerlerde kullanmak istiyorsak enum'lardan faydalanabiliriz

public class App {
    public static void main(String[] args){
        // Enum'lardan örnek üretilemez
        // Days days = new Days(); // hata verir
        Days gun = Days.Salı;
        System.out.println("Gun: "+gun);
        if(gun == Days.Salı){
            System.out.println("Bugün Salıı");
        }
        else {
            System.out.println("Bugün Salı Değil");
        }


        Months ay = Months.Mayıs;
        System.out.println(ay.getMonthID());
        System.out.println(ay.getMonthName());


        for (Directions directions: Directions.values()){
            System.out.println(directions);
        }

        System.out.println();

        DirectionInfo directionInfo = new DirectionInfo(Directions.Kuzey);
        directionInfo.getDirectionInfo();

        Directions direction = Directions.Kuzey;
        // Kısa IF Kodu:
        // değişken = (koşul) doğru ise bu işlem: yanlış ise bu işlem;
        boolean isEast = (direction == Directions.Batı) ? true: false;
    }
}
