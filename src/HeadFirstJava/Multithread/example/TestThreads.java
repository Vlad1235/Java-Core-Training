package HeadFirstJava.Multithread.example;

/**
 * Потоки из двух разных классов обновляют один и тот же объект - единственный экземпляр Accum.
 * Создается статический экземпляр этого класса( то есть один на весь класс)
 */
public class TestThreads {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        Thread one = new Thread(t1);
        Thread two = new Thread(t2);
        one.start();
        two.start();
    }
}
/*
two 1001
one 1001
two 2002
one 2003
two 3003
one 3004
two 4004
one 4005
two 5005
one 5006
one 6006
two 7006
one 7007
two 8007
one 8008
two 9008
one 9009
two 10009
one 10010
two 11010
one 11011
two 12011
one 12012
two 13012
one 13013
two 14013
two 14014
one 14015
one 15015
two 15015
two 16016
one 16017
one 17017
two 18017
two 18018
one 18019
two 19019
one 19020
one 20020
two 20020
two 20021
two 20022
two 20023
two 20024
two 20025
two 20026
two 20027
two 20028
two 20029
two 20030
two 20031
two 20032
two 20033
two 20034
two 20035
two 20036
two 20037
two 20038
two 20039
two 20040
two 20041
two 20042
two 20043
two 20044
two 20045
two 20046
two 20047
two 20048
two 20049
two 20050
two 20051
two 20052
two 20053
two 20054
two 20055
two 20056
two 20057
two 20058
two 20059
two 20060
two 20061
two 20062
two 20063
two 20064
two 20065
two 20066
two 20067
two 20068
two 20069
two 20070
two 20071
two 20072
two 20073
two 20074
two 20075
two 20076
two 20077
two 20078
two 20079
two 20080
two 20081
two 20082
two 20083
two 20084
two 20085
two 20086
two 20087
two 20088
two 20089
two 20090
two 20091
two 20092
two 20093
two 20094
two 20095
two 20096
two 20097
two 20098
 */