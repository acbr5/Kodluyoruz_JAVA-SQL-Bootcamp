package IO_Operations;

// kullanıcı girdi/çıktı ve dosya işlemleri Java'nın io kütüphanesi ile yapılır
// reader, karakter içeren ve karakter bazlı dosyaların içerisindeki karakterlerin okunabilmesi için kullanılıyor
// writer, belirli karakterlerin veya karakter dizisinin dosyalara yazılmasını sağlar
// dosyalar çok sık kullanılmaktadır
// Dosya işlemleri yapabilmek için java.io paketinin içerisindeki file sınıfından yararlanılır.
// File sınıfından nesne oluştururken dosya ve dizin ismi ile özelleştirilebilir. Direkt dosya ismi yazılırsa bulunulan dizinde oluşturacaktır
// Gerçek hayattan uygulama: müşterilerle ilgili excel dosyası var. Buradaki müşterilerin e-postalarını kısa bir şekilde okumak istiyorsunuz. Uygulamanızla belirli aralıklarla bu müşterilere otomatik mail atma işlemini yapmak istiyorsunuz.

import java.io.IOException;

public class App {

    public static void main(String[] args) throws Exception {
        FileWriting write = new FileWriting();
        write.write();

        FileReading read = new FileReading();
        read.read();
    }
}
