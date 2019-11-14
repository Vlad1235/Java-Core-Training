package HeadFirstJava.Multithread.example;

public class ThreadTwo implements Runnable {
    Accum a = Accum.getAccum();
    @Override
    public void run(){
        for (int x=0;x<98;x++){
            a.updateCounter(1);
            try{
                Thread.sleep(50);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println("two "+a.getCount());
        }
    }
}
