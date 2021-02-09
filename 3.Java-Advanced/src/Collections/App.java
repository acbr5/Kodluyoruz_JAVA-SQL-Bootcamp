package Collections;

// Java'da belirli bir koleksiyon içerisinde belirli bir veri yığını üzerinde işlem yapmamıza olanak sağlar
// Diziler, listeler olabilir
// Stream'in anlamı zaten akış demek
// Örneğin YouTube'da bir video izlerken videonun şu an izlenen kısmı stream'i, videonun tamamı ise koleksiyonu tanımlar.
// Ne gibi faydalar sağlar?
// Kullanıcının yalnızca ihtiyaç duyduğu verileri bir akış üzerinden çıkarıp, gerektiğinde kullanıcıya göstermeden üretmek gibi düşünülebilir.
// Koleksiyonun bütünü ile değil bir parçası ile ilgileniriz.
// List ve Set, koleksiyondur.

public class App {
    public static void main(String[] args){
        Colllections colllections = new Colllections();

        System.out.println("------List------");
        colllections.list();

        System.out.println("------Set------");
        colllections.set();

        System.out.println("------Map------");
        colllections.map();

        System.out.println("------TreeMap------");
        colllections.treeMap();
    }
}













