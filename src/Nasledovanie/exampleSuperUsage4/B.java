package Nasledovanie.exampleSuperUsage4;

public class B extends A{
    int k;

    B(int x, int y, int z){
        super(x,y);
        k = z;
    }

    void show() {
        System.out.println("k: " + k);
    }
}
