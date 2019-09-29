package ObektnoOrientirovanMishlenie;
/**
 * Тут дается характеристика класса. Базовое строение любого класса.
 */
public class ClassConstraction {
    /**
     * переменные экземпляра они же глобальные переменные они же атрибуты.
     */
    private static String companyName = "Blue Cab Company";
    private static String Name;
    private ClassConstraction myCab;

    /**
     * Конструктор(ы).
     */
    public ClassConstraction(){
        Name = null;
        myCab = null;
    }
    /**
     * Геттеры и сеттеры.Модификаторы доступа.
     */
    public void setName(String iName){
        Name = iName;
    }
    public static String getName(){ // ЭТО НЕ правильно при static, любой вызывающий этот метод объект будет менять единственную копию и у всех остальных будет меняться!
        return Name;
    }
    /**
     * Открытый интейрфейс.
     */
    public void giveDestination(){
        // код реализации.
        //turnLeft(){}
        //turnRight(){}
    }
    /**
     * Закрытая реализация.
     */
    private void turnRight(){ }
    private void turnLeft(){}
}
