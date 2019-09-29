package Nasledovanie.ExampleSuperUsage;

public class B extends A {
    int i;

    B(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("Член i в родительском классе: " + super.i);
        System.out.println("Член i в наследуемом классе: " + i);
    }

    public static void main(String[] args) {
        B sork = new B(1,2);
        sork.show();
    }
}
/*
Член i в родительском классе: 1
Член i в наследуемом классе: 2
 */