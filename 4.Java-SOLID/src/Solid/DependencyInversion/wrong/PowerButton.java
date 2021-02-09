package Solid.DependencyInversion.wrong;

// Bu sınıf üst seviyeli sınıftır. Çünkü metotlarının içerisinde Lamp sınıfının objesi çağırılmıştır.
// Burada başka bir eşya için (örneğin şarj cihazı) nesne oluşturulmak istenildiğinde o eşya için de ayrı bir PowerButton sınıfı oluşturulmak zorunda.
// PowerButton sınıfı bu durumda Lamp sınıfına bağımlı olmuş oldu.

class PowerButton {

    Lamp lamp;
    boolean status;

    PowerButton(Lamp lamp){
        this.lamp = lamp;
        this.status = false;
    }

    boolean isOpen(){
        return this.status;
    }

    void press(){
        boolean openLamp = isOpen();

        if(openLamp){
            lamp.close();
            this.status = false;
        }
        else {
            lamp.open();
            this.status = true;
        }
    }
}
