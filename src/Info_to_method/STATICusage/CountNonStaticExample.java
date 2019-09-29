package Info_to_method.STATICusage;

/**
 * Здесь такой опасности нет!!!!
 */
public class CountNonStaticExample {
    int count;

    public static void main(String[] args) {
        CountNonStaticExample count1 = new CountNonStaticExample();
        count1.count = 1;
        System.out.println(count1.count);
        CountNonStaticExample count2 = new CountNonStaticExample();
        count2.count = 2;
        System.out.println(count2.count);
        System.out.println(count1.count);
    }
}
/*
1
2
1
* */