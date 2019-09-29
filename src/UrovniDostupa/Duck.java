//package UrovniDostupa;
//
///**
// * Пример ошибки
// */
//
//public class Duck {
//    private int size;
//
//    public static void main(String[] args) { // статический метод
//        System.out.println("Размер равен :" + getSize());
//    }
//
//    public void setSize(int s){
//        size = s;
//    }
//    public int getSize(){
//        return size;
//    }
//}
///*
// *Error:(7, 47) java: non-static method getSize() cannot be referenced from a static context
// */
///**
// * Статические методы НЕ могут использовать нестатические методы или нестатические переменные.
// *         System.out.println("Размер равен :" + size); - также будет ошибка.
// */