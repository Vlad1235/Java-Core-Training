package Nasledovanie.Nasledovanie3;

class B extends A {
        void m1() { // переопределение метода m1 из родительского класса А
            System.out.print(" "); // чтобы был отступ от значения прошлого метода
            super.m1(); // сначала вызывается и выполняется оригинальная версия родительского класса метода м1
            System.out.print("Nasledovanie3.B's m1, ");
        }
}

