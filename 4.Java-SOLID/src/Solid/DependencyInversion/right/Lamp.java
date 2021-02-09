package Solid.DependencyInversion.right;

// Düğmeler ve cihazlar arasındaki ilişkiyi sağlamak için bir soyutlama katmanı eklenmelidir.

// değiştirilebilir objeden miras aldık
class Lamp implements ICanChange{

    @Override
    public void open(){
        System.out.println("Lamba açıldı.");
    }

    @Override
    public void close(){
        System.out.println("Lamba kapandı.");
    }

}
