package HeadFirstJava.Multithread.RunmorethanOne;
/**
Показательно как два потока влияют на одну переменную в классе BankAccount.
 Вопрос решается через synchronized модификатор метода
 */
public class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob(); // задача для n-потоков
        /*
        Создаем 2 потока с одной задачей, это значит оба потока будут работать с одним экземпляром счета из класса BankAccount
         */
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Overdrawn!");
            }
        }
    }
    /*
    модификатор syncronized запрещает работу другому потоку, до тех пор пока поток, который уже начал работу с методом не завершит свою.
     */
    //  to demonstrate the "overdrawn" error remove the "synchronized" modifier
    //  private synchonized void makeWithdrawal(int amount)
    private void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) { //Если средств хватает то приостанавливаем поток, затем возобновляем и завершаем транзакцию
            System.out.println(Thread.currentThread().getName() + " is about to withdrawal");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException ex) { ex.printStackTrace(); }
            System.out.println(Thread.currentThread().getName() + " woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        }
        else {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }
}
/*
Ryan is about to withdrawal
Monica is about to withdrawal
Monica is going to sleep
Ryan is going to sleep
Monica woke up
Ryan woke up
Monica completes the withdrawal
Ryan completes the withdrawal
Monica is about to withdrawal
Ryan is about to withdrawal
Ryan is going to sleep
Monica is going to sleep
Monica woke up
Ryan woke up
Ryan completes the withdrawal
Ryan is about to withdrawal
Ryan is going to sleep
Monica completes the withdrawal
Monica is about to withdrawal
Monica is going to sleep
Ryan woke up
Ryan completes the withdrawal
Ryan is about to withdrawal
Ryan is going to sleep
Monica woke up
Monica completes the withdrawal
Monica is about to withdrawal
Monica is going to sleep
Ryan woke up
Ryan completes the withdrawal
Ryan is about to withdrawal
Monica woke up
Monica completes the withdrawal
Monica is about to withdrawal
Monica is going to sleep
Ryan is going to sleep
Ryan woke up
Monica woke up
Monica completes the withdrawal
Monica is about to withdrawal
Monica is going to sleep
Ryan completes the withdrawal
Sorry, not enough for Ryan
Sorry, not enough for Ryan
Sorry, not enough for Ryan
Sorry, not enough for Ryan
Sorry, not enough for Ryan
Monica woke up
Monica completes the withdrawal
Overdrawn!
Sorry, not enough for Monica
Overdrawn!
Sorry, not enough for Monica
Overdrawn!
Sorry, not enough for Monica
Overdrawn!
Sorry, not enough for Monica
Overdrawn!

 */