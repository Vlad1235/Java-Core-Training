package HeadFirstJava.Static;

public class StaticSuper {
    /*
Статический блок из родительского класса
     */
    static {
            System.out.println("Родительский статистический блок");
        }
    /*
HeadFirstJava.Static.StaticSuper - это конструктор родительского класса.
     */
    StaticSuper() {
            System.out.println("Родительский конструктор");
        }

    }

