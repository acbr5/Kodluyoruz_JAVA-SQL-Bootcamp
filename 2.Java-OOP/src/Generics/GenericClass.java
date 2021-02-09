package Generics;

//Jenerik yapıya sahip bir sınıf oluşturalım
// T tipi birden fazla tür için çalışır
// Sınıf tipi belirtmek için genellikle T kullanılır
public class GenericClass<T> {
    private T deger;

    public void setDeger(T value){
        this.deger = value;
    }

    public T getDeger(){
        return deger;
    }
}
