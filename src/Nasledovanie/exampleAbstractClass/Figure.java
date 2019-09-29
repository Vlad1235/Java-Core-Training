package Nasledovanie.exampleAbstractClass;

/**
 * одновременное объявление класса как abstract и final недопустимо, по·
 * скольку абстрактный класс принципиально является незавершенным и только его
 * подклассы предоставляют полную реализацию методов!!!!
 */
 abstract class Figure {
    double dim1;
    double dim2;

    Figure(double x, double y){
        dim1 = x;
        dim2 = y;
    }

    abstract double area();

    int sum(){
        return (int)(dim1+dim2);
    }

}
