//package Cycles.cycles1;
//
//public class VivestiNZnacheny {
//    /*
//    Необходимо, чтобы заданный символ встречался в строке хотя бы 2 раза.
//
//*/
//
//    public void vivestiNZnacheny1() {
//
//        String str1 = new String("мама мыла раму");
//        char symb = 'а';
//        int max = str1.length();
//        boolean find = false;
//        int raz = 0;
//
//        for (int i = 0; i <= max; i++) {
//            raz = raz + 1;
//            if (str1.charAt(i) == symb && raz == 2) {
//                find = true;
//                break;
//            }
//        }
//
//        if (find) {
//            System.out.println("Символ " + symb + " найден " + raz + "раза");
//        } else {
//            System.out.println("Символ не найден");
//        }
//    }
//}
//
///*
// Была проблема выводило -Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 14
//Опытные люди:
//
//Индексация массива начинается с 0, то есть максимальный индекс массива из 10 элементов = 9 (0,1,2,3,4,5,6,7,8,9).
//Когда ты запрашиваешь длину строки (searchMe.length()) , тебе передается точное кол-во символов, (например те же 10), вот и получается ,
// что обращаясь к символу строки с 10 индексом ты выходишь за границы массива.
//
//Как исправил - for (int i = 1; i <= max; i++) { исправил на строку for (int i = 0; i <= max; i++) {
//*/