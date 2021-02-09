package Enum;

import javax.xml.stream.events.DTD;
import java.sql.Driver;

public enum Directions {
    Doğu("Doğu"),
    Batı("Batı"),
    Kuzey("Kuzey"),
    Güney("Güney");

    private final String direction;

    Directions(String direction){
        this.direction = direction;
    }

    public String getDirection(){
        return direction;
    }
}
