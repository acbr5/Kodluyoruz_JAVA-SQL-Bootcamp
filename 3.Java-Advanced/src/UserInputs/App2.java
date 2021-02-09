package UserInputs;

import java.util.Scanner;

//Scanner'ın içerisinde delimiter() adlı bir metot vardır.
// Girilen String ifadedeki kelimeleri boşluklara göre ayırır.
// hasNext() ile ayrılan kelimelere ulaşılabilir.
public class App2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girdi: ");
        scanner.delimiter();

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}
