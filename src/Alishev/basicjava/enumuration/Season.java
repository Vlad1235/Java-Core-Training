package Alishev.basicjava.enumuration;

/**
 * Название Enum обычно в единственном числе. Это good practice
 */
public enum Season {
    SUMMER(25),WINTER(-20),AUTUMN(10),SPRING(30); // это объекты класса Season

    private int temperature;

    private Season(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return "Season{ " + name()+
                " temperature=" + temperature +
                '}';
    }
}
