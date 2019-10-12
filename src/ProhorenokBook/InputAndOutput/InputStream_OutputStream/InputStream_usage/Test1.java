package ProhorenokBook.InputAndOutput.InputStream_OutputStream.InputStream_usage;

import java.io.*;

/**
 * available() - возвращает количество байтов, которое можно прочитать без блокировки текущего процесса( то есть,
 * ресурс с которым связан поток не отвечает, то текущий процесс блокируется до момента получения данных)
 * readAllBytes() - читает все данные из потока и возвращает массив. Метод доступен начиная с Java 9.
 * transferTo() - читает все данные из потока и записывает их в выходной поток. Метод возвращает количество переданных байтов. Начиная с Java 9
 * close() - закрывает поток и высвобаждает ресурсы.
 * Все методы могут генерировать контролируемое исключение, поэтому обязательно предусмотреть обработку исключений.
 */
public class Test1 {
    public static void main(String[] arg) throws IOException {
        InputStream in = null;
        OutputStream out = null;

        try{
            in = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\InputStream_OutputStream\\testingFile.txt");
            /*
            автоматически создаст новый файл testingPast.txt
             */
            out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\InputStream_OutputStream\\testingPast.txt");
            System.out.println(in.transferTo(out)); // 6
        } finally {
            if(in !=null) in.close();
            if(out != null) out.close();
        }

    }
}
/*
6
 */