package HeadFirstJava.Collections.TreeSet;

public class Book implements Comparable {

    private String title;
    public Book( String t){
        this.title = t;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return (title.compareTo(book.title));
    }
    @Override
    public String toString(){
        return this.title;
    }
}

