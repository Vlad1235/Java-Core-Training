package Arrays.arrays5;

public class Hobbits {
        String name;


        public static void main(String[] args) {
            // создаем 3 ссылочные переменные, которые впоследствие можно будет соединить с классом arrays5.Hobbits
            Hobbits[] h = new Hobbits[3];
            // соединили ссылочные перменные с вновь созданнымими объектами к классу arrays5.Hobbits
            h[0] = new Hobbits();
            h[1] = new Hobbits();
            h[2] = new Hobbits();
            // присваиваем новые значение через оператор действия "."
            h[0].name = "Bilbo";
            h[1].name = "Frodo";
            h[2].name = "Sam";

            int x = 0;
            while(x<3){
                System.out.print(h[x].name + " ");
                System.out.println(" имя хорошего Хоббита");
                x=x+1;
            }
        }
}
/*
Bilbo  имя хорошего Хоббита
Frodo  имя хорошего Хоббита
Sam  имя хорошего Хоббита
 */
