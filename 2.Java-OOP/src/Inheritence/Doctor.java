package Inheritence;

public class Doctor {
    private String name;
    private int yas;

    Doctor(){
        this.name = "";
        this.yas = 23;
    }

    Doctor(String doctorName, int doctorAge){
        this.name = doctorName;
        this.yas = doctorAge;
    }

    public int getYas(){
        return yas;
    }

    void getDoctorInfo(){
        System.out.println("----Doktor Bilgileri----");
        System.out.println("Doktor Adı: "+name);
        System.out.println("Doktor Yaşı: "+yas);
    }
}
