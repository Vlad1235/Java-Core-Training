package Alishev.middleleveljava.thread.firstrealization;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("I am going to sleep");
        Thread.sleep(3000);
        System.out.println("I an awake");
    }
}

class myTheada extends Thread{
    @Override
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("Hello from myThreada"+i);
        }
    }
}