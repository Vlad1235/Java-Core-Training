package ProhorenokBook.Generics.GenericClass;

public class ClassB <T1,T2> {
    public T1 obj1;
    public T2 obj2;
    public T2 obj3;

    int x;

    public ClassB(T1 obj1, T2 obj2, T2 obj3, int x){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
        this.x = x;
    }
    public static void main(String[] args) {
        ClassB<Integer,Double> c = new ClassB<Integer, Double>(10,1.5,25.9,8);
        // var c = new ClassB<Integer, Double>(10,1.5,25.9,8); тоже правильно так указывать начиная с java 10
        System.out.println(c.obj1);
        System.out.println(c.obj2);
        System.out.println(c.obj3);
        System.out.println(c.x);
    }
}
/*
10
1.5
25.9
8

 */