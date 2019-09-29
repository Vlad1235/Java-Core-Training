package Nasledovanie.exampleSuperUsage2;


public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
}
