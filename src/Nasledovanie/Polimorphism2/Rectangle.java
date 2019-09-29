package Nasledovanie.Polimorphism2;

 class Rectangle extends Figure {
    Rectangle(double x, double y){
        super(x,y);
    }
    double area(){
        System.out.println("В области четырехугольника.");
        return dim1*dim2;
    }
}
