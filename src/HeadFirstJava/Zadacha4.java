package HeadFirstJava;

public class Zadacha4 {
        public static void main(String[] args){
            int x = 0;
            while(x<10){
                if(x>2){
                    System.out.println("Большой икс");
                }
            x = x+1;//из -за отсутсвия этой строчки компилятор работал бесконечно
            }
        }
    }

/*
Большой икс
Большой икс
Большой икс
Большой икс
Большой икс
Большой икс
 */