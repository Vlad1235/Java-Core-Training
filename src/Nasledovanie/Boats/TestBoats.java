package Nasledovanie.Boats;

/**
 * Проверка на соответствие IS-A
 */

public class TestBoats {
    public static void main(String[] args) {
        Boat boat = new Boat();
        Sailboat sailboat = new Sailboat();
        Rowboat rowboat = new Rowboat();

        sailboat.setLength(21);
        boat.move();
        rowboat.move();
        sailboat.move();
    }
}
/*
Дрейф Дрейф Поднять паруса!
 */
