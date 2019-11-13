package HeadFirstJava.Multithread.Uncontrolled;

public class MyRunnable implements Runnable {
    public void run(){ // у интерфейса лишь один этот метод, который необходимо реализовать
        go(); // именно в метод run помещается задача, которую затем новый поток должен будет выполнить. Это метод, который будет на дне нового стека!
    }
    public void go(){
        doMore();
    }
    public void doMore(){
        System.out.println("Вершина стека");
    }
}
