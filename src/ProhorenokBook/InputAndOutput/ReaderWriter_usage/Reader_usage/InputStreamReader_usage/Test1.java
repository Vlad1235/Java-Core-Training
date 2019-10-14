package ProhorenokBook.InputAndOutput.ReaderWriter_usage.Reader_usage.InputStreamReader_usage;

/**
 * Класс InputStreamReader - является реализацией абстрактного класса Reader и позволяет записываеть символы в поток InputStream
 * InputStreamReader(InputStream in) - используется кодировка системы, по умолчанию. Избегать этого конструктора!! при работе с русскими символами. В разных системах разная кодировка.
 *  InputStreamReader(InputStream in, String charsetName) throws UnsupportedEncodingException - можно указать кодировку в виде строки
 *  InputStreamReader(InputStream in, Charset cs) - принимает объект класса Charset.
 *
 *  По работе с конструктором также как и в OutputStreamWriter.
 *
 *   * Класс InputStreamReader- наследует все методы из класса Reader
 *  * Добавляет метод getEncoding() - возвращает кодировку потока в виде строки.
 */
public class Test1 {
}
