package Nasledovanie.exampleSuperUsage4.metodSuperUsage;

public class B extends A {
    int k;

    B(int x, int y, int z){
        super(x,y);
        k = z;
    }

    void show() {
        super.show(); // вызываем метод show() из родительского класса А
//        System.out.println("k: " + k);
    }
}
