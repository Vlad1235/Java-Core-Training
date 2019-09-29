package Nasledovanie.Boats;

public class Boat {
    private int length;

    public void setLength(int len) {
        if(len > 20) {
            length = len;
        } else {
            System.out.print("Не хватает длины паруса ");
        }
    }

    public int getLength(){
        return length;
    }

    public void move(){
        System.out.print("Дрейф ");
    }
}
