package ProhorenokBook.FilesAndCatalogues.File_usage;

import java.io.File;

/**
 * Работа с каталогами
 */
public class Test4 {
    public static void main(String[] args) {
        /*
        isDirectory() - Если объект содержит путь к каталогу, то true
        mkdirs() - создает все каталоги в пути
        renameTo() - переменовать каталог
        list() - возвращает массив с названиями файлов и каталогов внутри указанного каталога
        delete() - удаляет пустой каталог
        exists() - возвращает true если каталог существует
         */
        File f = new File("C:\\Users\\");
        System.out.println(f.isDirectory()); //true
        File makeFile = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\newTestCatalogue");
        System.out.println(makeFile.mkdirs()); //true Файл создан!
        File makeRenableFile = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\newRenable");
        Boolean done = makeRenableFile.mkdirs();
        System.out.println(makeRenableFile.renameTo(new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\renamedFolder"))); //true
        File prohorenokFolder = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\");
        String[] list = prohorenokFolder.list();
        for (String s: list) {
            System.out.println(s);
            File file = new File(f,s);
            System.out.println("---Каталог " + file.isDirectory());
            System.out.println(" --- Файл " + file.isFile());
        }

        // File dlt = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\renamedFolder");
       // Boolean deleted = dlt.delete(); //true

        Boolean exist = prohorenokFolder.exists();
        System.out.println(exist); // true
    }
}
/*
Arrays
---Каталог false
 --- Файлfalse
ClassWrapers
---Каталог false
 --- Файлfalse
Collections
---Каталог false
 --- Файлfalse
ENUM_usage.java
---Каталог false
 --- Файлfalse
FilesAndCatalogues
---Каталог false
 --- Файлfalse
Generics
---Каталог false
 --- Файлfalse
InnerClass
---Каталог false
 --- Файлfalse
InputAndOutput
---Каталог false
 --- Файлfalse
Interface
---Каталог false
 --- Файлfalse
LyambdaExpression
---Каталог false
 --- Файлfalse
Nasledovanie
---Каталог false
 --- Файлfalse
Numbers
---Каталог false
 --- Файлfalse
Object_class
---Каталог false
 --- Файлfalse
OperatoryIcycles
---Каталог false
 --- Файлfalse
Password_generator
---Каталог false
 --- Файлfalse
Polimorphism
---Каталог false
 --- Файлfalse
StaticVariable
---Каталог false
 --- Файлfalse
String_about
---Каталог false
 --- Файлfalse
Test.java
---Каталог false
 --- Файлfalse
TryCatch
---Каталог false
 --- Файлfalse
VARvariable.java
---Каталог false
 --- Файлfalse
 */