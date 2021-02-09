package UserInputs;

import java.util.Scanner;

//Scanner sınıfı ile kullanıcıdan veri girdisi alınır
public class App1 {

    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adınız Giriniz: ");

        String username = inputScanner.nextLine();
        System.out.println(username);

        try {
            System.out.println("Kullanıcı Yaşını Giriniz: ");
            int age = inputScanner.nextInt();
            System.out.println(age);
        }catch (Exception e){
            System.out.println("Yanlış türde yaş girdiniz!");
        }

        inputScanner.close();
    }
}
