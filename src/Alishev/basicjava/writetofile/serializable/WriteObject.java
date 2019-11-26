package Alishev.basicjava.writetofile.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
            Person person1 = new Person(1,"Bob");
            Person person2 = new Person(2,"Mike");

        try {
            /*
            Запись абстракто последовательности байтов(неважно, это будут байты файлом музыки, игр или любых других объектов)
             */
            FileOutputStream fo = new FileOutputStream("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\serializable\\Peope.bin"); //обычно инфу сохраняют в файле типа BIN. Данный файл автоматически не создается, если его нет то выбросит исключение
            /*
            Более конкретный и узко специализированный, предназначен для записи объектов то есть преобразования в байткод, НО ФИЗИЧИЕСКИ не умеет записывать
             */
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close(); // обязательно закрыть поток!
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
