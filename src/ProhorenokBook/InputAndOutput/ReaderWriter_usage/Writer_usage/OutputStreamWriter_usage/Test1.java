package ProhorenokBook.InputAndOutput.ReaderWriter_usage.Writer_usage.OutputStreamWriter_usage;
/**
 * Класс OutputStreamWriter - является реализацией абстрактного класса Writer и позволяет записываеть символы в поток вывода
 * OutputStreamWriter(OutputStream out) - используется кодировка системы, по умолчанию. Избегать этого конструктора!! при работе с русскими символами. В разных системах разная кодировка.
 * OutputStreamWriter(OutputStream out, String charsetName) throws UnsupportedEncodingException - можно указать кодировку в виде строки
 * OutputStreamWriter(OutputStream out, Charset cs) - принимает объект класса Charset. Пример:
 *
 * OutputStream out = null;
 * Writer file = new OutputStreamWriter(out, Charset.forName("cp1251"));
 *
 * во втором параметре также можно указать статические константы класса StandardCharsets
 * OutputStream out = null;
 * Writer file = new OutputStreamWriter(out, StandardCharsets.UTF_8);
 *
 * Класс OutputStreamWriter - наследует все методы из класса Writer
 * Добавляет метод getEncoding() - возвращает кодировку потока в виде строки.
 */
public class Test1 {
}
