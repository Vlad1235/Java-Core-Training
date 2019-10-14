package ProhorenokBook.InputAndOutput.ReaderWriter_usage.Writer_usage;

/**
 * Класс Writer() - база для символьных потоков вывода
 *
 * метод write() - записывает символы в поток.
 * write(int c) - записывает в поток один символ
 * write(char[] cbuf,int off, int len) throws IOException - len смиволов из массива cbuf, начиная с индекса off
 * write(char[] cbuf)  - все символы из массива cbuf
 * write(String str) - все символы и сроки
 * write(String str,int off, int len) throws IOException
 *
 * append() - записывает символы в поток и возвращает ссылку на поток.
 * append(char c) - записывает в поток один символ
 * append(CharSequence csq, int start, int end) throws IOException - фрагмент от индекса start до end(не включая) из объекта csq
 * append(CharSequence csq) throws IOException -  все символы
 * В качестве параметра csq можно указать объекты классов String, StringBuilder,StringBuffer,CharBuffer, Segment
 *
 * flush() - сбрасывает данные из буфера(при наличии) в файл.
 *
 * close() - сбрасывает данные из буфера(при наличии) в файл и закрывает поток. ОБЯЗАТЕЛЬНО ЗАКРЫВАТЬ!!!!
 *
 * Все методы могут генерировать контролируемое исключение даже при закрытии потока. Поэтому необходимо предусмотреть обрааботку исключений.
 * Если забыть закрыть поток, то данные  помещенные в буфер не будут сброшены в файл.
 */
public class Test1 {
}
