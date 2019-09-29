package Info_to_method;

/**
 * Инициализируем переменную ТОЛЬКО один раз! И затем в методы будет передаваться лишь копия этой переменной. Чтобы
 * метод с ней не делал оригинал не изменится. Однако я в коде ниже нашел способ ее изменить.
 */

public class Dog {

    void go(int z){
        System.out.println(z);
    }

    int go2(int z){
        int size2 = z;
        size2 = 10; // тут уже просто
        return size2;
    }


    public static void main(String[] args){
        Dog one = new Dog();
        int size = 7; // тут инициализация. Оригинал.
        one.go(size);
        size = one.go2(size); // эта строка.
        System.out.println(size);
    }
}
