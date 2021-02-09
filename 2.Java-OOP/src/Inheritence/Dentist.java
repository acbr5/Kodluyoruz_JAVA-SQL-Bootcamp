package Inheritence;

public class Dentist extends Doctor{
    private String username;

    Dentist(){
        this.username = "ayse_cybersec";
    }

    Dentist(String dentistUsername){
        this.username = dentistUsername;
    }

    void getDentistInfo(){
        System.out.println("----Dişçi Bilgileri----");
        System.out.println("Doktor Kullanıcı Adı: "+username);
        System.out.println("Doktor Yaşı: "+this.getYas());
    }
}
