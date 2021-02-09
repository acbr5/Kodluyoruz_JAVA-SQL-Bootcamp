package Solid.DependencyInversion.right;

// Bu sınıf üst seviyeli sınıftır. Çünkü metotlarının içerisinde Lamp sınıfının objesi çağırılmıştır.
// Burada başka bir eşya için (örneğin şarj cihazı) nesne oluşturulmak istenildiğinde o eşya için de ayrı bir PowerButton sınıfı oluşturulmak zorunda.
// PowerButton sınıfı bu durumda Lamp sınıfına bağımlı olmuş oldu.

// aşağıdaki şekilde elektrik düğmesi herhangi bir nesneye doğrudan bağlı değil

class PowerButton implements IButton, ICanChange{

    ICanChange device;
    boolean status;

    PowerButton(ICanChange device){
        this.device = device;
        this.status = false;
    }

    @Override
    public boolean isOpen() {
        return this.status;
    }

    @Override
    public void press() {
        boolean openObject = isOpen();
        if(openObject){
            device.close();
            this.status = false;
        }
        else{
            device.open();
            this.status = true;
        }
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
