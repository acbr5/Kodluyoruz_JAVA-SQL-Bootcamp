package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Examples {
    private Pattern desen;
    private Matcher eslesme;
    private boolean eslesmeBulundu;

    public void giris(){
        // büyük küçük duyarlılığı olmayan ve içerisinde "kodluyoruz" stringi geçen bir pattern oluşturuldu:
        // İkinci parametreye flag denilir.
        desen = Pattern.compile("kodluyoruz", Pattern.CASE_INSENSITIVE);

        if(eslesmeKontrol(desen, "ben kodluYoruZ derslerine katılıyorum206"))
            System.out.println("Eşleşme Bulundu!");
        else
            System.out.println("Eşleşme Bulunamadı!");


        // Farklı flag kullanımları:
        // LITERAL, özel karakterlerin (escape) normal bir karakter gibi algılanmasını sağlar. Örneğin \n alt satıra geçmeyi ifade eder fakat LITERAL kullanıldığında abc gibi normal karakter olarak algılanınr.
        // CASE_INSENSITIVE, büyük küçük harf duyarlılığını ortadan kaldırır.
        // Birden fazla flag kullanmak için aralara | işareti koyulur.
        // UNICODE_CASE İngiliz alfabesi dışındaki diğer harflerin de dahil edilmesini sağlar.

        desen = Pattern.compile("çağdışı\n", Pattern.CASE_INSENSITIVE | Pattern.LITERAL |  Pattern.UNICODE_CASE);
    }

    public boolean eslesmeKontrol(Pattern desen, String str){
        // Pattern ile eslesip eslesmediğini kontrol eden bir nesne üretildi.
        eslesme = desen.matcher(str);

        // eslesme bulunduysa true, bulunmadıysa false döner:
        eslesmeBulundu = eslesme.find();
        return eslesmeBulundu;
    }

    public void meta_karakterler(){
        // köşeli parantezler içindeki harfleri bulur: [klm] yani string klm harflerinin üçünü de içeriyorsa find() metodu true döner demek
        // ^ işareti ifadenin değilini alır. [^klm] klm harflerini içermiyorsa
        // Köşeli parantez içerisinde aralık da belirtilebilir: [0-5] 0 ile 5 aralığındaki değerleri içeriyorsa

        // META KARAKTERLER
        // Özel anlama sahip olan karakterlerdir.
        // | işareti, veya anlamındadır: gmail|hotmail|yahoo gibi
        // . işareti, herhangi bir karakterin yalnızca tek bir örneğini bulur: .a örneği var mı gibi
        // ^ işareti, bu işaretten sonra gelen kelime ile başlayan örnekleri bulur: ^Merhaba merhaba ile başlıyorsa find() true döner gibi
        // $ işareti, bu işaretten önce gelen kelime ile biten örnekleri bullur: kodluyoruz!$ ile bitiyorsa find() true döner gibi
        // \d işareti, sayı hanesi bulunmak istenildiği durumda sembolize etmek için kullanılır: "kodluyoruz\\d" (özel karakter olarak algılaması için bir tane daha ters slaş koyduk)
        // \s işareti, boş karakter sınırlanmak istenildiği durumlarda kullanılır. Yeni bir satır, tab veya boşluk karakterleri boş (white space) karakter olarak geçer: "\smerhaba kodluyoruz!\s" başında ve sonunda boş karakter varsa true döner
        // \b işareti, kelimenin başında ve sonunda karakter dizisi kontrolü yapar. "\\bmerhaba" ya da "kodluyoruz\\b"
        // \w işareti, kelime karakteri (word character) herhangi bir kelime karakterinin olmasının istenildiği durumda kullanılır. ^w veya \W ise olumsuzudur (kelime karakteri olmayan). Kelime karakterler şunlardır: [a-zA-Z_0-9]. Kullanılışı: "\\W*"


        desen = Pattern.compile("katılıyorum.\\d", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        desen = Pattern.compile("^\\w*", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        if(eslesmeKontrol(desen, "ben kodluYoruZ,derslerine_katiliyorum206"))
            System.out.println("Kelime Karakteri Eşleşmesi Bulundu!");
        else
            System.out.println("Kelime Karakteri Eşleşmesi Bulunmadı!");
    }

    public void nicelikBelirleyiciler(){
        // * işareti, birden fazla olmasını ifade eder. "kodluyoruz.*" kodluyoruz.org, kodluyoruz.com.tr olabilir demek
        // + işareti, kontrol edilen metinde bir veya birden fazla sınırlanan kelime var mı diye kontrol edilir. "kodluyoruz+" gibi
        // ? işareti, kontrol edilen metinde sınırlanan kelimeden sadece bir tane olması durumunda kullanıyoruz. "com?" gibi
        // {a} işaretleri, uzunluğu sınırlar. \d{6},  sayısının kaç defa tekrarlandığını bulur. Örneğin .{7} 7 karakterli bir dizi girilebilir demek
        // {a,b} işaretleri, a ve b harfleri en az ve en çok değerlerimi belirtir.

        String str1="kod";
        boolean ornek1 = Pattern.matches("[Kk]odluyoruz", str1);
        System.out.println(str1+" kelimesinin "+"başlangıç harfleri [Kk]'den biri mi: "+ornek1);

        String str2 = "kod";
        // her harf için ayrı parantez açılarak kontrol edilir:
        boolean ornek2 = Pattern.matches("[a-k][l-o][b-d]", str2);
        System.out.println(str2+" kelimesindeki harfler "+"[a-k][l-o][b-d] aralığında mı: "+ornek2);

        String str3 = "kodluyoruz.com";
        boolean ornek3 = Pattern.matches("kodluyoruz.*", str3);
        System.out.println(str3+" kelimesinde "+"noktadan sonra her şey gelebilir: "+ornek3);

        String str4 = "153kodluyouruz";
        boolean ornek4 = Pattern.matches("[\\d].*", str4);
        System.out.println(str4+" kelimesi "+"sayı ile başlayıp sonrasında istenilen veri gelmiş mi: "+ornek4);

        String str5 = "Hello World";
        boolean ornek5 = Pattern.matches("^Hello$", str5);
        System.out.println(str5+" kelimesi "+"Hello ile başlayıp Hello ile bitiyor mu: "+ornek5);

        String str6 = "adaadaada";
        // ifadeleri kalıp halinde gruplandırmak istiyorsak normal parantez kullanılır. ()
        boolean ornek6 = Pattern.matches("(ada){1,3}", str6);
        System.out.println(str6+" kelimesi "+" (ada){1,3} değeri en az 1 kere en çok 3 kere tekrar ediyor mu: "+ornek6);

        // ilk karakteri kontrol etmek için köşeli parantez kullanılır. []
        String str7 = "adalaradalaradalaradalar";
        boolean ornek7 = Pattern.matches("[ada]{1,3}.*", str7);
        System.out.println(str7+" kelimesi "+" ada ifadesi ile başlıyor mu ve sonrasında başka harfler geliyor mu: "+ornek7);

        // Alfa-nümerik ve alt tire olmayan karakterler "\\W" sınıfına girer.
        // "\\w" ise içerisinde alfa-nümerik ve alt tire karakterlerini barındırdığında true döner.
        // Sadece 4 karakter ve alfa nümerik olmayan true döner
        String str8 = "$!?#";
        boolean ornek8 = Pattern.matches("\\W{4}", str8);
        System.out.println(str8+" kelimesi içerisinde alfa-nümerik ve alt tire karakteri barındırmayan 4 harfli bir kelime mi: "+ornek8);

        // "\\D" sayı değilse, "\\d" sayı ise
        String str9 = "1 hello";
        boolean ornek9 = Pattern.matches("[\\d]\\s*", str9);
        System.out.println(str9+" metni içerisinde son kelime sayı ile başlıyor mu: "+ornek9);

        // başlangıçta kodluyoruz içersin, devamında @ gelsin, herhangi bir karakter dizisi bir grup olarak gelebilir, $ işareti ile yapı bu şekilde bitsin denildi
        String str10 = "kodluyoruzIK@gmail.com";
        boolean ornek10 = Pattern.matches("^(kodluyoruz.*)@(.+)$", str10);
        System.out.println(str10 + " metni 'kodluyoruz' ile başlıyor mu: "+ornek10);

        String str11 = "kodluyoruzIK@mail.com";
        boolean ornek11 = Pattern.matches("^(.+)@(gmail|hotmail|yahoo).com$", str11);
        System.out.println(str11 + " metni 'gmail', 'hotmail' ya da 'yahoo' ile bitiyor mu: "+ornek11);

        String str12 = "kod kod kodluyoruz";
        boolean ornek12 = Pattern.matches("(kod){1,2}", str12);
        System.out.println(str12 + " metni içerisinde en az 1, en çok iki kere 'kod' geçiyor mu: "+ornek12);

        //"?" kendisinden önce gelen kısmı yok sayar. Kısaltmalarda kullanılır
        String str13 = "Nov 12";
        boolean ornek13 = Pattern.matches("Nov(ember)?.*", str13);
        System.out.println(str13 + " metni içerisinde Nov var mı: "+ornek13);

        // iki kullanımı olan kelimeler için de ? kullanılabilir
        String str14 = "colour";
        boolean ornek14 = Pattern.matches("colou?r", str14);
        System.out.println(str14 + " kelimesi colour ya da color mı: "+ornek14);

        // ikinci sayı hanesi olmasa da olur
        String str15 = "Sep 16";
        boolean ornek15 = Pattern.matches("Sep(tember)?\\s[\\d][\\d]?", str15);
        System.out.println(str15 + " metni içerisinde Sep var mı ve sonrasında tek ya da iki haneli bir sayı gelmiş mi: "+ornek15);

        //özel karakter olarak algılamaması için \\? şekilde kullanılır
        String str16 = "google.com/search?id=1";
        boolean ornek16 = Pattern.matches("google.com/search\\?id=1", str16);
        System.out.println(str16 + " linki birbirinin aynısı mı: "+ornek16);


        // FARKLI PATTERN OLUSTURMA METOTLARI

        // split ile String bir metin belirtilen karaktere göre ayrıştırılabilir.
        String splitOrnek = "kitap, kalem, dolma kalem, silgi, defter";
        String[] elemanlar = splitOrnek.split(", ");
        for (String eleman:elemanlar) {
            System.out.println(" "+eleman);
        }

        // Replace, bir metinde belirtilen ifadeyi belirtilen ifade ile değiştirir.
        String rplOrnek = "araba tren uçak roket uçak otobüs uçak";
        String karakter = rplOrnek.replaceFirst("otobüs","metrobüs");
        System.out.println("Karakterler: "+karakter);

        // Replace all, metindeki belirtilen bütün ifadeleri değiştirir.
        String karakter2 = rplOrnek.replaceAll("uçak", "helikopter");
        System.out.println("karakterler: "+karakter2);
    }
}
