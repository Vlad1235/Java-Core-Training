package ProhorenokBook.OperatoryIcycles;
/**
 * Супер полезное использование треарного оператора. Сразу возвращаемое значение присваивается переменной.
 */
public class TrenarnyOperator1 {
    public static void main(String[] args) {
        int x,y;
        x=0;
        y = 30+10/(x==0 ? 1:x);
        System.out.println(y);
        x=2;
        y = 30+10/(x==0 ? 1:x);
        System.out.println(y);
    }
}
/*
40
35
* */