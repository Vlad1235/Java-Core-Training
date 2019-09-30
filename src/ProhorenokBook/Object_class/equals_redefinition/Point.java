package ProhorenokBook.Object_class.equals_redefinition;

public class Point {
    /**
     * If we made to objects to compare via equals() it is ok, but if we try to use equals for comparing
     * their coordinates it will show false result. Therefore we need to redefine method equals()
     */

    private int x,y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
// Чтобы с помощью класса equals() можно было сравнивать и координаты у одинаковых объектов нужно прописать
//    все возможновые варианты
    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Point p = (Point)obj;
        return  this.x == p.x && this.y == p.y;
    }
}
