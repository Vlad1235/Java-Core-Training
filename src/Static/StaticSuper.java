package Static;

public class StaticSuper {
    /*
Статический блок из родительского класса
     */
    static {
            System.out.println("Родительский статистический блок");
        }
    /*
Static.StaticSuper - это конструктор родительского класса.
     */
    StaticSuper() {
            System.out.println("Родительский конструктор");
        }

    }

