package Alishev.basicjava.innerclass;

public class Electrocar {
    private int id;

    // вложенный нестатический класс. Он обычно модификатором доступа private
    // Имеют доступ к полям объекта класса Электрокар.
    // Такой тип нужен ЕСЛИ класс Электрокар сложный, состоит из многих объектов, если всебы запихали в один, то
    // класс Электрокар был бы слишком сложным.
    private class Motor{
        public void startMotor(){
            System.out.println("Motor with" +id+" is starting...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar" + id + "is starting..");
    }
}
