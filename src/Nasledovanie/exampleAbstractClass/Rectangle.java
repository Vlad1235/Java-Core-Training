package Nasledovanie.exampleAbstractClass;

class Rectangle extends Figure {
   Rectangle(double x, double y){
       super(x,y);
   }
   double area(){
       System.out.println("В области четырехугольника.");
       return dim1*dim2;
   }
   int sum(){
       System.out.println("Сумма + 10");
       return (int)(dim1+dim2+10);
   }
}
