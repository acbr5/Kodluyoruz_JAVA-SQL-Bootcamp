package Solid.LiskosSubstitution;

// Yerine geçme prensibi demektir.

// Kural alt (türetilmiş) sınıfları üst sınıfın yerine kullanabilmektir.
// Amaç, kodda değişiklik yapmadan alt sınıfları üst sınıfın yerine kullanabilmek.
// Üst sınıftan farklı bir davranış gösteriyor mu göstermiyor mu bunu anlamaya çalışıyoruz.
// Alt sınıftan oluşan nesneleri, üst sınıf nesneleri ile yer değiştirdikten sonra aynı özellik ve davranışı göstermelidir.
// Eğer farklı özellik ve davranış gösteriyorsa kodda bu prensibe uymayan bir sıkıntı var demektir.
// Yani yer değiştirme sonrasında türetilmiş sınıflar üst sınıfların tüm özellik ve davranışlarını sergilemelidir.
// Aynı zamanda Open/Closed prensibine uymak bu prensibe uymayı da kolaylaştıracaktır.
// Miras hiyerarşisi doğru yapılandırmak gerekmektedir.

// Örneğin bir dikdörtgen sınıfından bir kare sınıfının türetildiğini düşünelim.
// Kare sınıfı dikdörtgen sınıfının tüm özelliklerini karşılamaz, çünkü karenin bütün kenarları birbirine eşittir.
// Bu durum için farklı bir hiyerarşi oluşturulmalıdır.

public class LiskosSubstitution {
}
