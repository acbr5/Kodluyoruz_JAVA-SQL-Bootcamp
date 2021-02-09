package Enum;

public class DirectionInfo {

    Directions direction;

    DirectionInfo(Directions direction){
        this.direction = direction;
    }

    public void getDirectionInfo(){
        switch (direction){
            case Batı:
                System.out.println("Batıya gider");
                break;
            case Doğu:
                System.out.println("Doğuya gider");
                break;
            case Güney:
                System.out.println("Güneye gider");
                break;
            default:
                System.out.println("Kuzeye gider");
        }
    }
}
