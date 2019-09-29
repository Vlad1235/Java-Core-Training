package HeadFirstJava;

public class MovieTestClass {
//Данный класс является тестовым для "НАСТОЯЩЕГО" класса
// В данном проверочном классе создаются ОБЪЕКТЫ и им предоставляется доступ к настоящему классу через оператов доступа ТОЧКА (.)
        public static void main(String[] args){
            // Назначаем новый объект ONE
            Movie one = new Movie();
            one.title = "Как прогореть на акциях";
            one.genre = "Трагедения";
            one.rating = -2;
            // Назначаем новый объект TWO
            Movie two = new Movie();
            two.title = "Потерянные в офисе";
            two.genre = "Комедия";
            two.rating = 5;
            two.playIt();
            // Назначаем новый объект THREE
            Movie three = new Movie();
            three.title = "Байт-Клуб";
            three.genre = "Трагедия, но в целом веселая";
            three.rating = 127;
        }

}

