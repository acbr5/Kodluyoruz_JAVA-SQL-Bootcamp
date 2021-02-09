package IO_Operations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

    public File dosya;

    public Scanner reader;

    public String line;

    public void findFile(){

        try {
            dosya = new File("my file.txt");
            //File dosya = new File("/home/aysenurb/IdeaProjects/HackerRank/hafta5/my files.txt");
            //File dosya = new File("/home/aysenurb/IdeaProjects/HackerRank/hafta5","my files.txt");
            //File dosya = new File("C:\\aysenurb\\dosya.txt"); //Windows'ta kullanımı

            if(!dosya.exists()){
                System.out.println("Dosya mevcut değil. Aynı adda dosya oluşturuluyor.");
                dosya.createNewFile();
            }

        }catch (IOException e){
            //System.out.println("dosya oluşturma hatası: "+e.getMessage());
            e.printStackTrace();
        }
    }

    public void read(){
        findFile();
        try{
            //dosya üzerinden okuma yapar
            reader = new Scanner(dosya);

            //Satır satır okuma yapmak için
            while (reader.hasNextLine()){
                line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}