package Polymorphism;

// Çok biçimlilik. Üst sınıfta bulunan bir metotun alt sınıfta farklı şekillerde davranmasını sağlayabiliriz
// statik ve dinamik çokbiçimlilik olmak üzere ikiye ayrılır
// Statik polimorfizim metot overloading (aynı isme sahip birden fazla metot olması, farklı parametreler ve farklı tipler ile) yapılarak gerçekleştirilir.
// Aşağıdaki örnek de dinamik polimorfizme örnek olabilir

// Overloading = statik
// Overriding = dinamik


public class App {
    public static void main(String[] args){
        AltSinif altSinif = new AltSinif();
        altSinif.getSuperMetot();
        altSinif.metot("aysenur","1234567");
    }
}

class UstSinif{
    public String password;
    public void metot(String username, String password){
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }
}

class AltSinif extends UstSinif{
    public String password;
    public void metot(String username, String password){
        System.out.println("----Alt Sınıf----");
        System.out.println("Username: "+username);
        System.out.println("Password: "+password+username+"hash");
    }

    public void getSuperMetot(){
        super.metot("aysenurr","123456789");
    }
}