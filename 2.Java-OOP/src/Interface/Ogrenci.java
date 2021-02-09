package Interface;

public class Ogrenci implements OkulUyesi, KursUyesi {
    @Override
    public void sinavaGir(){
        System.out.println("Öğrenci sınava girer.");
    }

    @Override
    public void sertifikaAl(){
        System.out.println("Öğrenci sertifika alır");
    }
}