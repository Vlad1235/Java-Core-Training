package Info_to_method.StaticMethod;

/**
ЧТобы передать в метод значение, которое метод вычислил, нужно сделать это возвращающим значение.!!!
 */
public class PeredachaParametraPoZnacheniy2 {
    public static int func(int x){
        x = x+20;
        return x;
    }

    public static void main(String[] args) {
        int x = 10;
        x = func(x);
        System.out.println(x);
    }
}
/*
30
 */