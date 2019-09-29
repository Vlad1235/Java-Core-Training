package Nasledovanie.exampleAbstractClass;

class Triangle extends Figure {
   Triangle(double x, double y){
       super(x,y);
   }
   double area(){
       System.out.println("В области треугольника.");
       return dim1*dim2 / 2;
   }
    int sum(){
        System.out.println("Сумма + 20");
        return (int)(dim1+dim2+20);
    }
}
