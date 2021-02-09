package Encapsulation;

//Erişim belirleyiciler ile verilere nereden ulaşılıp nereden ulaşılmayacağı belirlenir
// public ile bütün sınıflardan ve alt sınıflardan ulaşılabilir
// protected ile aynı package içerisindeki ve birbiri ile alakalı sınıflardan ulaşılabilir
// private ile sadece tanımlandığı sınıftan erişilebilir.
// Soyutlamada sınıfların ne yapabileceği ile ilgilenirken, kapsülleme de nasıl yapılabileceği ile ilgileniriz


public class App {
    public static void main(String[] args) throws Exception{
        Circle nesne1 = new Circle();
        Circle nesne2 = new Circle(5.4, "purple");
        Circle nesne3 = new Circle(15.4);

        double nesne1Yaricap = nesne1.getRadius();
        String nesne1Renk = nesne1.getColor();
        double nesne1Alan = nesne1.getArea();

        System.out.println("Birinci nesnenin yarıçapı: "+nesne1Yaricap);
        System.out.println("Birinci nesnenin rengi: "+nesne1Renk);
        System.out.println("Birinci nesnenin alanı: "+nesne1Alan);

        nesne1.setColor("gray");
        System.out.println("Birinci nesnenin yeni rengi: "+nesne1.getColor());
    }
}