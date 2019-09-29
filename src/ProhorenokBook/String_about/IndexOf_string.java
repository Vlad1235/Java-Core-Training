package ProhorenokBook.String_about;

/**
 * Поиск в строке. Возвращает индекс позиции, с которой начинается вхождение нужного символа в строку.Если построка не входит, то
 * возвращает -1
 */
public class IndexOf_string {
    public static void main(String[] args) {
        String s = "Наша Маша горько плачет";
        System.out.println(s.indexOf("наша")); // -1
        System.out.println(s.indexOf("Ма")); // 5
        System.out.println(s.indexOf("тест")); // -1
        System.out.println(s.indexOf("пла")); // 17
        /*
        Ищет не с начала строки, а с указанного индекса
         */
        System.out.println(s.indexOf("Маша",5)); //5
        System.out.println(s.indexOf("маша",5)); //-1
        System.out.println(s.indexOf("сладко",10)); // -1

        /*
        Метод lastIndexOf() - возвращает индекс позиции последнего вхождения в строку. Поиск начинается с конца строки
         или с указанного места fromIndex
         */
        System.out.println(s.lastIndexOf("ша")); //7
        System.out.println(s.lastIndexOf("а")); // 19
        System.out.println(s.lastIndexOf("ту")); //-1
        System.out.println(s.lastIndexOf("а",17)); //8
        System.out.println(s.lastIndexOf("Маша",11)); //5



    }
}
