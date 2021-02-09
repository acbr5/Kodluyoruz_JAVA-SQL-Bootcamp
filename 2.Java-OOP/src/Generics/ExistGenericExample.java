package Generics;

import java.util.ArrayList;
import java.util.Random;

public class ExistGenericExample {
    public ArrayList<String> list;

    ExistGenericExample(){
        list = new ArrayList<>();
    }

    public void addList(String str1, String str2, String str3){
        list.add(str1);
        list.add(str2);
        list.add(str3);
    }

    public String getElement(){
        Random random = new Random();
        int sayi = random.nextInt(3);

        if(sayi<0) sayi = sayi * (-1);

        return list.get(sayi);
    }
}
