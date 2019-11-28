package Alishev.middleleveljava.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * нумерация id группы идет с единицы
 */
public class Test4 {
    public static void main(String[] args) {
        String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n" +
                "keep in touch.Thanks, Joe! That's cool. I am sending you\n" +
                "my address: tim@yandex.ru.Lets's stay in touch...";
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");  // на данный момент если считать по () то тут 3 группы
        Matcher matcher = email.matcher(text);

        while (matcher.find()){ //
            System.out.println(matcher.group()); // выводим всю строку
        }
 /*
joe@gmail.com
tim@yandex.ru
  */

/*
        while (matcher.find()){ //
            System.out.println(matcher.group(1)); //  выводим лишь имена. Это  по номеру первой группы. По группам делится в регулярном выражении согласно ().
        }
joe
tim

*/
//        while (matcher.find()) { //
//            System.out.println(matcher.group(2)); // если хотим получить инфу на каком сайте у них имейлы
//        }
/*
gmail
yandex
 */


    }
}



// Эмпиричексим путем выясниил что ОДНОВРЕМЕННО НЕЛЬЗЯ СРАЗУ ДВА ЦИКЛА ВЫЗВАТЬ И ИНФОРМАЦИЮ ПО ДВУМ ГРУППАМ