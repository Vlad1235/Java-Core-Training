package Nasledovanie.example1;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(1,2,3,5.5);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        ColorBox mybox3 = new ColorBox(3,4,6,255);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);

        System.out.println("цвет mybox3 равен " + mybox3.color);
    }
}
/*
Объем mybox1 равен 3000.0
Вес mybox2 равен 34.3

Объем mybox2 равен 24.0
Вес mybox2 равен 0.076
 */
