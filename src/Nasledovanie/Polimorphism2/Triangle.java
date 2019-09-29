package Nasledovanie.Polimorphism2;

 class Triangle extends Figure {
    Triangle(double x, double y){
        super(x,y);
    }
    double area(){
        System.out.println("В области треугольника.");
        return dim1*dim2 / 2;
    }
}
