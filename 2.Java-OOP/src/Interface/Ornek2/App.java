package Interface.Ornek2;

//İnterface'ler içerisinde de miras alınabilir.

public class App {
    public static void main(String[] args){
        Stadium stadium = new Stadium();
        stadium.setHomeTeam("Kodluyoruz");
        System.out.println(" "+stadium.getHomeName());
        stadium.setVisitingTeam("Aysenur's Team");
        System.out.println(" "+stadium.getVisitingName());
    }
}