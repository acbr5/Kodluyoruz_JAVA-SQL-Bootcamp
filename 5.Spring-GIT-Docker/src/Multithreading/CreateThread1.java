package Multithreading;

// Thread'ler iki şekilde oluşturulabilir:
// Thread nesnesi, Java'da var olan Thread sınıfından extends edilebilir.
// Ya da Runnable arayüzü implements edilebilir.


class CreateThread1 extends Thread{

    @Override
    public void run(){
        // mevcut thread'i temsil eder
        Thread currentThread = Thread.currentThread();

        // mevcut thread'in ID'si
        // ID değerini farklı kayıtları görüntüleyebilmek adına kullanacağız
        long currentThreadId = currentThread.getId();

        try{
            System.out.println("Thread " + currentThreadId + " is runnig...");
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
