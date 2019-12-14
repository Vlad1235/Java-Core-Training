package ProhorenokBook.Generics;

/**
 * Как делать не стоит пытаясь обобщить использование класса. В коде правильно, но это bad practice
 */
public class Dumpchoice {
    private Object obj;

    public Dumpchoice(Object obj) {
        setObj(obj);
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }


    public static void main(String[] args) {
        Dumpchoice a = new Dumpchoice(10);
        a.setObj("строка");
        String s = "";
        int x = 0;
        if (a.getObj() instanceof Integer) {
            x = (int) a.getObj();
            System.out.println(x);
        } else if (a.getObj().getClass() == String.class) {
            s = (String) a.getObj();
            System.out.println(s);
        }
    }
}
/*
строка
 */