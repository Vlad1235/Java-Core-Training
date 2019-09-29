package HeadFirstJava.Collections.LinkedList;

import java.util.*;

/**
 * Чтобы сортировать обязательно помнить про Компаратор
 */
public class SortMountains {
    LinkedList<Mountain> mnt = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return (two.height-one.height);
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go(){
            mnt.add(new Mountain("Лонг-Рейндж", 14255));
            mnt.add(new Mountain("Эльберт",14433));
            mnt.add(new Mountain("Марун",14156));
            mnt.add(new Mountain("Касл",14265));
        System.out.println("В порядке добавления: \n" + mnt);

        NameCompare nc = new NameCompare();
        Collections.sort(mnt,nc);
        System.out.println("По названию: \n" + mnt);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mnt,hc);
        System.out.println("По высоте: \n" + mnt);
    }
}
/*
В порядке добавления:
[Лонг-Рейндж 14255, Эльберт 14433, Марун 14156, Касл 14265]
По названию:
[Касл 14265, Лонг-Рейндж 14255, Марун 14156, Эльберт 14433]
По высоте:
[Эльберт 14433, Касл 14265, Лонг-Рейндж 14255, Марун 14156]
 */