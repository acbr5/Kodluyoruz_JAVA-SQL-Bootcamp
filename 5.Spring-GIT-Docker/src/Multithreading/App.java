package Multithreading;

// Eş zamanlı olarak birden fazla eylemi yerine getirme eylemidir.
// Java'da Multitasking'in özelleşmiş hali multithreading olarak geçer.
// Thread'ler, programdaki her bir işlem parçalarını temsil eder.
// Genellikle CPU'dan maksimum faydayı elde edebilmek için kullanılır. Birden fazla iş parçasını aynı anda yürütmek istersek bunu kullanırız.

// En yaygın örneği; bir dokümanda yazı yazarken müzik dinlemek birbirinden bağımsız iki işlemdir ve eş zamanlı olarak gerçekleşebilir.
// Bankada 2-3 ATM'den aynı anda işlem yapılabilir.

// Birbirinden bağımsız işlemlerin eş zamanlı olarak gerçekleştirilmesi de denebilir.
// Thread'lerin sunduğu bir avantaj da dengeli kaynak paylaşımıdır.
// Birden çok CPU'nun da tam verimli kullanılması söz konusu olabilir.

// Thread Yaşam Döngüsü
// 1) New durumu yeni nesnenin oluşturulduğu adımdır. Thread sınıfından nesne oluşturulduğunda
// (start() metodu çağırılmadan önce) ilk olarak bu durumda olur.
// start() metodu çağırıldıktan sonra thread, Runnable durumuna geçer. Çalışmaya hazır demektir. Çalışabilir fakat Thread zamanlayıcısı, çalışması için bu thread'i henüz seçmedi demek.
// Running durumunda artık thread çalışır durumdadır.
// Non Runnable durumunda, thread hala hayattadır ama kesintiye uğramış durumdadır. Örneğin sleep() metodu ile belirli bir süre beklenilmesi istenmiştir.
// Terminated durumu, run() metodu işlevini yerine getirdiği ya da stop() metodu ile thread'in durdurulduğu durumdur.


public class App {

    public static void main(String[] args) throws Exception{
        // varsayılan bir thread oluşturma:
        Thread thread = new Thread("İlk Thread");
        thread.start();
        thread.setName("İlk Thread");
        System.out.println(thread.getName() + " " + thread.getId() + " is " + thread.getState());

        // Kalıtım ile kendi custom thread'imizi oluşturma
        Thread thread1 = new Thread(new CreateThread1());
        thread1.start();


        // Arayüz ile kendi custom thread'imizi oluşturma
        Thread thread2 = new Thread(new CreateThread2());
        thread2.start();
    }

}