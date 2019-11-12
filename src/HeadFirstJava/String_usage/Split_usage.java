package HeadFirstJava.String_usage;

/**
 * Метод split() позволяет разбивать строку на части, при указанном разделителе
 */
public class Split_usage {
    public static void main(String[] args) {
        String toTest = "Какой цвет получится при сочетании синего и желтого?/Зеленый";
        String[] result = toTest.split("/"); // разбиение сроки в данном случае на 2 части
        for (String token:result){
            System.out.println(token);
        }
    }
}
/*
Какой цвет получится при сочетании синего и желтого?
Зеленый
 */