package job4j.BooleanLogic.logic2;

public class OtlichieDlyaString {
    //Оператор == работает иначе на объектных типах данных, нежели на примитивных(числовых) с точки зрения логических операторов.
    // Когда мы используем объекты и хотим проверить их равенство, то оператор == укажет нам лишь на то, являются ли объекты одними и теми же или нет.
    // Если же необходимо проверить логическое равенство объектов, то следует использовать метод equals
    String str1 = new String("Privet");
    String str2 = new String("Privet");
    String sameStr = str1;

    public void logika() {
        boolean b1 = str1 == str2;// b1 - false, потому что str1 и str2 это 2 разных объекта
        boolean b2 = str1.equals(str2);// b2 - true, потому что str1 и str2 логически эквивалентны
        boolean b3 = str1 == sameStr;// b3 -true, потому что str1 и sameStr в действительности один и тот же объект
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
// мои коментарии - нельзя между собой пытаться через логический оператор сравнить текстовые переменные!
// Поэтому метод equals

