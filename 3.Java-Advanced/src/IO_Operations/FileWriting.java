package IO_Operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public File dosya;

    public FileWriter fw;

    public void createFile(){
        try {
            dosya = new File("my file.txt");
            //File dosya = new File("/home/aysenurb/IdeaProjects/HackerRank/hafta5/my file.txt");
            //File dosya = new File("/home/aysenurb/IdeaProjects/HackerRank/hafta5","my file.txt");
            //File dosya = new File("C:\\aysenurb\\dosya.txt"); //Windows'ta kullanımı


            // dosya oluşturulabiliyorsa true döner
            if(dosya.createNewFile()){
                System.out.println("Dosya Oluşturuldu: "+dosya.getName());
            }else{
                System.out.println("Dosya Zaten Mevcut");
            }
        }catch (IOException e){
            //System.out.println("dosya oluşturma hatası: "+e.getMessage());
            e.printStackTrace();
        }
    }

    public void write(){
        createFile();
        try{
            fw = new FileWriter(dosya);
            // var olan verinin üzerine ekleme yapar:
            //fw.append("merhabaa");

            // dosyaya verilen metni yazar (dosyada yazı varsa üzerine yazar):
            fw.write("Merhaba Kodluyoruz\n");
            fw.append("Ben Ayşenur\n");
            fw.append("Java'da giriş çıkış işlemlerini çalışıyorum\n");

            //her zaman input/output işlemlerinde close işlemi yapılmalı
            fw.close();
            // System.out.println("Dosyaya yazma başarılı.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}