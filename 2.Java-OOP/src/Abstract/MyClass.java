package Abstract;/*public class Abstract.MyClass {
}*/

// eğer sınıf içerisinde abstract bir metot tanımlanmışsa sınıf da abstract
// olmak zorunda. Fakat abstract bir sınıf içerisinde soyut olmayan bir sınıf tanımlanabilir
abstract class MyClass{
  //soyut metot
  abstract void metot();

  void digerMetot(){
      //digerMetot'unun çalıştıracağı kodlar
  }
}
