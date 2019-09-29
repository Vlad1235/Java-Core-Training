package Nasledovanie.exampleSuperUsage2;

public class Shipment extends BoxWeight {
    double cost;

    /**
     * Данный конструктор берет значения из близжайшего по иерархии класса! BoxWeight!
     * @param x
     * @param y
     * @param z
     * @param u
     * @param c
     */
    Shipment(double x, double y, double z, double u, double c){
        super(x,y,z,u);
        cost = c;
    }

    Shipment(){
        super();
        cost = -1;
    }

}
