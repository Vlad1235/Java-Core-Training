package HeadFirstJava;

/**
 * Запомнить, что в метод аргумент передается по значению! То есть копия. Первоначальное число не изменится.
 * Однако, в случае с ссылочной переменной он передается как копия "пульта" на определенный объект, и этим новым пультом можно изменить объект, а главное управлять им!
 * Последовательность битов одной сслыли присваивается другой и они начинают командовать одним и тем же экземпляром класса.
 * Итого - управление экземпляром класса через 2 ссылки!
 */
public class XCopy {

    private  int testVariable;

    int go(int arg){
        return arg*2;
    }

    public XCopy change(XCopy obj){
        XCopy objNew = obj;
        return objNew;
    }


    public static void main(String[] args) {
        int orig = 5;
        XCopy copy = new XCopy();
        int result = copy.go(5); // копирование по значению
        System.out.println(result + " " + orig); // 10 5

        XCopy novObj = copy.change(copy);
        copy.testVariable = 128;
        System.out.println(novObj==copy); // true
        int var1 = copy.go(5);
        int var2 = novObj.go(6);
        System.out.println(novObj.testVariable); // 128
        novObj.testVariable = 129;
        System.out.println(copy.testVariable); // 129
        System.out.println(var1 + " "+ var2); //10 12
        copy = null; // отцепили от экземпляра класса
       // System.out.println(copy.testVariable); // Exception in thread "main" java.lang.NullPointerException
        copy = new XCopy();
        copy.testVariable = 8;
        System.out.println(copy.testVariable); // 8
        System.out.println(novObj.testVariable); // 129
    }
}
/*
10 5
 */
