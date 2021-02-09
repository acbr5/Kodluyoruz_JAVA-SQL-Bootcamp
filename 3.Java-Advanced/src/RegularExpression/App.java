package RegularExpression;

// RegEx - Regular Expression - Kurallı İfadeler
// Oluşturduğumuz belirli kurala, desene uyan verileri getirmek için kullanılır.
// Bir pattern oluşturulur. Genellikle bu pattern'e göre arama yapılır.
// Örneğin cep telefonu girişi için kullanılabilir: (___)___ ___
// 11 haneli T.C kimlik numarası girişi
// RegEx ifadeleri formatlama ve arama amaçlı kullanılır.
// Java'da java.util.regex paketi import edilerek kullanılır.
// Pattern sınıfı ile pattern oluşturulur
// Matcher sınıfı ile bu pattern'e uyum uymadığı kontrol edilir
// PatternSyntaxException sınıfı ile bir pattern ile ilgili syntax hatası yapıldığında hatanın bilgilendirilmesi için kullanılır.



public class App {

    public static void main(String[] args) throws Exception{
        Examples examples = new Examples();
        examples.giris();

        System.out.println();
        examples.meta_karakterler();

        System.out.println();
        examples.nicelikBelirleyiciler();
    }

}
