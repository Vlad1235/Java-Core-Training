package HeadFirstJava.Glava4;

public class XCopy {

        public static void main(String[] args) {
            int orig = 42;
            XCopy x = new XCopy();
            int y = x.go(orig);
            System.out.println(orig + " " + y);
        }

        int go(int arg) {
            arg = arg*2;
            return arg;
        }
}
/*
42 84 - Важно запомнить что Java передает параметры по значению, то есть путем простого копирования, то есть перменная orig не изменится в методе go
 */