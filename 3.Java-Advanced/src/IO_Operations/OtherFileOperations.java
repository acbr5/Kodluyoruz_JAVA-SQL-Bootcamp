package IO_Operations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OtherFileOperations {

    public File dosya;

    public Scanner reader;

    public String line;

    public void fileInformations(){
        try{
            dosya = new File("my file.txt");
            if(!dosya.exists()){
                System.out.println("Dosya mevcut değil. Aynı adda dosya oluşturuluyor.");
                dosya.createNewFile();
                System.out.println("Dosya Adı: "+dosya.getName());
                System.out.println("Dosya Büyüklüğü: "+dosya.length());
                System.out.println("Tam Dizin: "+dosya.getAbsolutePath());
                System.out.println("Okunabilir mi: "+dosya.canRead());
                dosya.setReadOnly(); //dosyayı sadece okunabilir yapar
                dosya.setWritable(true); //dosyayı yazılabilir yapar
                System.out.println("Yazılabilir mi: "+dosya.canWrite());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void deleteFile(){
        dosya = new File("my file.txt");
        if(!dosya.exists()){
            if(dosya.delete()){
                System.out.println("Dosya Silindi: "+dosya.getName());
            }
        }
    }

    public void folderOperations(){
        File klasor = new File("/home/aysenurb/IdeaProjects/HackerRank/hafta5/","aysenurb");

        //klasör oluşturur
        if(klasor.mkdir()){
            System.out.println("Oluşturulan klasör: "+klasor.getName());
        }else{
            System.out.println("Klasör oluşturma işlemi başarısız");
        }

        //klasörü siler
        if(klasor.delete()){
            System.out.println("Silinen klasör: "+klasor.getName());
        }else{
            System.out.println("Klasör silme işlemi başarısız");
        }
    }
}
