
package HeadFirstJava.Multithread.ControlledviaSleep;
public class MyRunnable implements Runnable {
    public void run(){
        go();
    }
    public void go(){
        /*
        Заставляет поток поменять свое работающее состояние на заблокированное.
        В этот момент главный поток опять начинает работу и выводит строку "Возвращемся в метод main"
         */
        try{
            Thread.sleep(2000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        doMore();
    }
    public void doMore(){
        System.out.println("Вершина стека");
    }
}
