package Info_to_method.STATICusage;

/**
 * ОПАСНОСТЬ СТАТИЧЕСКИХ ПЕРЕМЕННЫХ!!!!
 */
public class Count {
    static int count;

    public static void main(String[] args) {
        Count count1 = new Count();
        count1.count = 1;
        System.out.println(count1.count);
        Count count2 = new Count();
        count2.count = 2;
        System.out.println(count2.count);
        System.out.println(count1.count); // предыдущая инициализация исчезла!!!
    }
}
/*
1
2
2
* */