package ProhorenokBook.Interface.DoubleInheritage;

public class D {
    private IRead ir;
    private IWrite iw;
    private String str = "";

    public D(IRead r,IWrite w){
        this.ir = r;
        this.iw = w;
        this.str = ir.read(); // Получаем данные
    }
    public void change(){
        this.str = this.str.toUpperCase(); // Обрабатываем данные
    }
    public void print(){
        this.iw.write(this.str); // Выводим данные
    }
}
