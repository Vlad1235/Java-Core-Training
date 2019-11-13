package HeadFirstJava.Multithread.RunmorethanOne;

public class BankAccount {
    private int balance = 100;

    public int getBalance () {
        return this.balance;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }
}
