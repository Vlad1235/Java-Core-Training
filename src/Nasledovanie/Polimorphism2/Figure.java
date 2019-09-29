package Nasledovanie.Polimorphism2;

 class Figure {
    double dim1;
    double dim2;

    Figure(double x, double y){
        dim1 = x;
        dim2 = y;
    }

    double area(){
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }

}
