package Stream;

import java.util.Comparator;
import java.util.stream.Stream;

// Java'da belirli bir koleksiyon içerisinde belirli bir veri yığını üzerinde işlem yapmamıza olanak sağlar
// Diziler, listeler olabilir
// Stream'in anlamı zaten akış demek
// Örneğin YouTube'da bir video izlerken videonun şu an izlenen kısmı stream'i, videonun tamamı ise koleksiyonu tanımlar.
// Ne gibi faydalar sağlar?
// Kullanıcının yalnızca ihtiyaç duyduğu verileri bir akış üzerinden çıkarıp, gerektiğinde kullanıcıya göstermeden üretmek gibi düşünülebilir.
// Koleksiyonun bütünü ile değil bir parçası ile ilgileniriz.
public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("********Stream Tanımlamaları********");
        DefinitionOfStream obj = new DefinitionOfStream();
        obj.definition();

        System.out.println("********Listeler Üzerinde Stream Kullanımı********");
        StreamOnLists obj2 = new StreamOnLists();
        obj2.streamOnLists();
    }
}