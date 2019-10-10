package ProhorenokBook.Collections.Map_usage.Properties;

import java.util.Properties;

/**
Properties - словарь, состоящий из конфигурационных данных.
 Ключи и значения являются строками.
 КЛасс позволяет загрузить данные из файла или сохранить в файл.
 Класс реализует интерфейс Map<K,V>  и класс Hashtable<K,V> поэтому содержит все методы из этого класса
 */
public class Test1 {
    public static void main(String[] args) {
    /*
    setProperty() - создает новый элемент или изменяет текущий
    getProperty() - возращает значение по ключу

     */
        Properties map0 = new Properties();
        map0.setProperty("login","myLogin");
        map0.setProperty("password","858524");
        System.out.println(map0.toString()); // {password=858524, login=myLogin}
        System.out.println(map0.getProperty("login")); //myLogin



    }
}
