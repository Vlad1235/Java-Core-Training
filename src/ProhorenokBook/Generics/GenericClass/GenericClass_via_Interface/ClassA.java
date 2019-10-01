package ProhorenokBook.Generics.GenericClass.GenericClass_via_Interface;

/**
 * Ограничиваем обощеныый тип несколькими интрефейсами.
 * Если наложено ограничение классом, то становятся доступные методы этого класса
 * Если наложено ограничение интерфесом(ами), то обобщенный тип будет иметь тип интерфейса и мы сможем получить доступ к методам, объявленным в интерфейсе.
 * @param <T>
 */
public class ClassA <T extends ITest1&ITest2> {
    public T obj;

    public ClassA(T obj){
        this.obj = obj;
    }
    public void test(){
        this.obj.test1();
        this.obj.test2();
    }
}
