package HeadFirstJava.Collections.TreeSet;

public class Book implements Comparable {

    String title;
    public Book( String t){
        this.title = t;
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return (title.compareTo(book.title));
    }
}

