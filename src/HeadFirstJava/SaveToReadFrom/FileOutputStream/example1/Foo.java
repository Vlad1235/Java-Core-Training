package HeadFirstJava.SaveToReadFrom.FileOutputStream.example1;

import java.io.Serializable;

public class Foo implements Serializable {
    /*
    Задача сохранить 2 этих значения
     */
    private int setWidth;
    private int setHeight;


    public int getSetWidth() {
        return setWidth;
    }

    public void setSetWidth(int setWidth) {
        this.setWidth = setWidth;
    }

    public int getSetHeight() {
        return setHeight;
    }

    public void setSetHeight(int setHeight) {
        this.setHeight = setHeight;
    }
}
