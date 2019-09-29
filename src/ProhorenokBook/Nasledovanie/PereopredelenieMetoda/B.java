package ProhorenokBook.Nasledovanie.PereopredelenieMetoda;


public class B extends A {
    /*
    В процессе переопределения метода можно напутать и создать метод с одинаковым методом, но с разной сигнатурой.
    В результате это будет перегрузка метода, а не переопределение. Оба варианта компилятор не будет считать ошибкой.
    Чтобы было именно переопределение, мы должны прописать @Override.
     */
    @Override
    public void func() {
        System.out.println("B.func()");
        super.func();                  // Вызываем метод базового класса
    }
}
