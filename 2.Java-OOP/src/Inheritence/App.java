package Inheritence;

//bir sınıf başka bir sınıftan türetilmek istendiğinde kalıtım kullanılır.
//Java'da yalnızca bir kere kalıtım yapılabilir

/*
class UstSinif{

}

class AltSinif extends UstSinif{
    //özellikleri tanımlarız
    //metotları tanımlarız
}
*/

public class App {
    public static void main(String[] args){
        Dentist dentist = new Dentist();
        dentist.getDentistInfo();
    }
}