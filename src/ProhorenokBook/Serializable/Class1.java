package ProhorenokBook.Serializable;

import java.io.Serializable;

public class Class1 implements Serializable {
    private static final long serialVersionUID = 4159958489342586369L; // за счет того, что static данная переменная не сохраняется.
    private int x;

    public Class1(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }

}
