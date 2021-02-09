package Enum;

public enum Months {
    Ocak(1, "Ocak"),
    Şubat(2, "Şubat"),
    Mart(3, "Mart"),
    Nisan(4, "Nisan"),
    Mayıs(5, "Mayıs"),
    Haziran(6, "Haziran"),
    Temmuz(7, "Temmuz"),
    Ağustos(8, "Ağustos"),
    Eylül(9, "Eylül"),
    Ekim(10,"Ekim"),
    Kasım(11,"Kasım"),
    Aralık(12,"Aralık");

    private int ay;
    private String ayTanim;

    Months(int ay, String ayStr){
        this.ay = ay;
        this.ayTanim = ayStr;
    }

    public int getMonthID(){
        return ay;
    }

    public String getMonthName(){
        return ayTanim;
    }
}