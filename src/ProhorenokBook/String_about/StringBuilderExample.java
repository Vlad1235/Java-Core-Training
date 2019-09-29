package ProhorenokBook.String_about;
import java.lang.StringBuilder;
/**
 * Способы конкатенации строк.
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        System.out.println("Строка" + " " + "строка2"); // быстро соединить, но медленно выполнять для компилятора.
        String s = "строка";
        s += " строка2"; // конкатенация с присваиванием.
        System.out.println(s);
        int x = 5;
        System.out.println("x = " + x); // прежде чем возвратить значение идет перевод всего в формат строк. Из-за этого долго.
        System.out.println(x + " x - целое число"); // прежде чем возвратить значение идет перевод всего в формат строк. Из-за этого долго.

        /*
        Использование класса StringBuilder.
         */
        StringBuilder stb = new StringBuilder();
        stb.append("строка1");
        stb.append(" ");
        stb.append("и");
        stb.append(" ");
        stb.append("строка2");
        stb.append(" ");
        stb.append("соеденены");
        String sb = stb.toString();
        System.out.println(sb); //строка1 и строка2 соеденены

    }
}
/*
Строка строка2
строка строка2
x = 5
5 x - целое число
строка1 и строка2 соеденены
 */