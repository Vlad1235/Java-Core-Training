package HeadFirstJava.SaveToReadFrom.File_usage;

import java.io.File;
/**
 Класс File это ПУТЬ файлу, но не сам файл. Дает имя и местоположение, но я является самим файлом
 File не содержит данные, которые расположены внутри запрашиваемого файла, и не предоставляет к ним доступ. ПРОСТО ПУТЬ.
 Аналогия с уличным адресом дома, но не сам дом.
 Позволяет безопасным способом предоставить файл, чем простое указание имени файла в виде строки.
 Позволяет создать файл, проверить что путь работает и только потом предоставить объект File другим, например FileWriter или FileOutputStream


 */
public class FileClassUsage {
    public static void main(String[] args) {
        /*
        Создать объект File представляющий существующий файл
         */
        File f = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\HeadFirstJava\\SaveToReadFrom\\File_usage\\ForTestReadingFrom.txt");
        /*
        Создать новый каталог, если его нет
         */
        File dir = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\HeadFirstJava\\SaveToReadFrom\\File_usage");
        dir.mkdir(); // Создать каталог, если его нет( у нас есть)
        /*
        Вывести содержимое каталога
         */
        if (dir.isDirectory()){
            String[] dirContents = dir.list();
            for (int i = 0;i<dirContents.length;i++){
                System.out.println(dirContents[i]);
            }
        }
        /*
        Получить абсолютный путь файла
         */
        System.out.println(f.getPath());
        /*
        Удалить файл или каталог(при выполнении возвращает true)
         */
        // boolean isDeleted = f.delete();
    }
}
/*
FileClassUsage.java
ForTestReadingFrom.txt
C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\HeadFirstJava\SaveToReadFrom\File_usage\ForTestReadingFrom.txt
 */