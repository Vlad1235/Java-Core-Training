package job4j.BooleanLogic.logic1;

public class SravnImen {
    // Я СВОИМ СПОСОБОМ РЕШИЛ ЗАДАЧУ!!!!!!!!!!!!! МО ЛО ДЕ Ц!!!
    //Даны имена 2х человек (тип String).
    //Если имена равны, то вывести сообщение о том, что люди являются тезками.
    public void sravn() {
        String str1 = new String("Vlad");
        String str2 = new String("Vlad");
        Byte b1= 0;
        Byte b2= 0; // решилось добавлением."Совет из CyberForum - Чтобы этого избежать, компилятор заставляет присваивать переменной начальное значение".

        try {
            b1 = Byte.valueOf(str1);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат данных");
        }
        try {
            b2 = Byte.valueOf(str2);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат данных");
        }
        if (b1 == b2) {
            System.out.println("Dva cheloveka teski");
        } else {
            System.out.println("Dva cheloveka ne teski");
        }

    }
}

