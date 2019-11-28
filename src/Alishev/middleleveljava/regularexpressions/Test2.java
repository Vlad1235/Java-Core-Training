package Alishev.middleleveljava.regularexpressions;

import java.util.Arrays;

/**
 * метод split() класса String который примнимает строку и разбивает ее, основываясь на указанном регулямном выражении на МАССИВ СТРОК
 * метод replace() заменяет одни символы на другие
 * метод replaceAll() используется если  мы хотим заменить сначала порезав изначальную строку согласно нашему регулямногому выражению.
 */
public class Test2 {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String[] words = a.split(" "); // на выходе массив строк
        System.out.println(Arrays.toString(words)); //[Hello, there, hey]

        String a1 = "Hello.there.hey";
        String[] words1 = a1.split("\\."); // не можем просто поставить точку, так как она является специальным символом, а тут мы просто ТОЧКУ передаем. Это КАК БЫ не регулярное выражение, а просто как делить слова
        System.out.println(Arrays.toString(words1)); //[Hello, there, hey]

        String a2 = "Hello123132there34234hey31414dgsgf";
        String[] words2 = a2.split("\\d+"); // делим по цифрам
        System.out.println(Arrays.toString(words2)); //[Hello, there, hey, dgsgf]


        String b = "Hello there hey";
        String modified = b.replace(" ","."); //используем пробел как разделитель, это кстати тоже регулярное выражение и потом заменяем разделитель на точку
        System.out.println(modified); //Hello.there.hey

        String c = "Hello12133there2323412they";
        String modif = c.replaceAll("\\d+","-"); //сначала используем паттерн для разделения, потом заменяем этот паттерн на тире
        System.out.println(modif); // Hello-there-they

        String d = "Hello12133there2323412they";
        String modonlyfirst = d.replaceFirst("\\d+","-"); // заменяем только по первому совпадению
        System.out.println(modonlyfirst); // Hello-there2323412they

    }
}
