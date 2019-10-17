package ProhorenokBook.StreamAPI;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Создание потока из файла или каталога
 *
 * Для создания потока срок из файла предназначен статический метод lines() из класса File()
 * Также, можно использовать метод lines() из класса BufferedReader, для чтения файлов построчно
 * Для чтения содержимого каталога используется стат метод list() из класса Files
 * Кодировка по умолчанию UTF-8
 */
public class Test5 {
    /*
    Первый способ
     */
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\StreamAPI\\forStreamTest.txt");
        try(
                Stream<String> stream  = Files.lines(p, Charset.forName("cp1251"));
                ) {
                stream.forEachOrdered((s) -> System.out.println(s));
        }

        /*
        Второй способ
         */
        try{
            InputStream in = new FileInputStream("C:"+ File.separator+"Users"+File.separator+"Work"+File.separator+"IdeaProjects"+File.separator+"PolnoyePovtorenie"+File.separator+"src"+File.separator+"ProhorenokBook"+File.separator+"StreamAPI"+File.separator+"forStreamTest.txt");
            Reader reader = new InputStreamReader(in,Charset.forName("cp1251"));
            BufferedReader buf = new BufferedReader(reader);
            Stream<String> stream = buf.lines();
            stream.forEachOrdered((s)-> System.out.println(s));
        } catch (Exception e){
            System.out.println("Обработка исключения");
        }

        /*
        Для чтения содержимого каталога. Пример вывода всех элементов каталога и только файлов с расширением .java
         */
        Path path = Paths.get("C:"+ File.separator+"Users"+File.separator+"Work"+File.separator+"IdeaProjects"+File.separator+"PolnoyePovtorenie"+File.separator+"src"+File.separator+"ProhorenokBook"+File.separator+"StreamAPI");
        try(Stream<Path> stream = Files.list(path)){
            stream.forEachOrdered((obj)-> System.out.println(obj.toString()));
        }
        try(Stream<Path> stream = Files.list(path)){
            stream.filter((path1)->path1.toString().endsWith(".java")).forEachOrdered((obj)-> System.out.println(obj.toString()));
        }
    }
}
/*
For stream test only
Hello StreamAPI
For stream test only
Hello StreamAPI
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\forStreamTest.txt
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test0.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test1.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test2.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test3.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test4.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test5.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test0.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test1.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test2.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test3.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test4.java
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\StreamAPI\Test5.java
 */