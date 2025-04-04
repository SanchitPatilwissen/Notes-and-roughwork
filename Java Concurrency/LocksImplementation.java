import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private int balance = 2000;

    private final Lock lock = new ReentrantLock(true); // Fairness is true. Threads are executed in the order they are created. eg : - AFter sunita, manisha will be executed.

    public void deposit(int amount) {
        synchronized (this) {
            try {
                System.out.println("Deposit started");
                Thread.sleep(1000);
                balance += amount;
                System.out.println("Deposit successful");
            } catch (InterruptedException e) {
                System.out.println("Deposit interrupted");
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) { // We can use synchronized keyword to ensure that only one thread can access this method at a time. But if we explicitly want to terminate and come out of the block then we will require explicit lock.
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){ // Indefinite wait is not occurring.
                try{
                    System.out.println("Withdrawal started by " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                    if (balance < amount) {
                        System.out.println("Insufficient balance by " + Thread.currentThread().getName());
                        System.out.println("Withdrawal failed by " + Thread.currentThread().getName());
                    } else {
                        balance -= amount;
                        System.out.println("Withdrawal successful by " + Thread.currentThread().getName()+" Remaining balance : "+balance);
                    }
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                finally{
                    lock.unlock();
                }
            }
            else{
                System.out.println("Could not get the lock by " + Thread.currentThread().getName());
            }
            
        } catch (InterruptedException e) { // InterruptedException is thrown by sleep() method. So we have to handle it.

        }
    }
}

public class LocksImplementation {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread user1 = new Thread(() -> {
            account.withdraw(1000);
        }, "Sunita");
        Thread user2 = new Thread(() -> {
            account.withdraw(1000);
        }, "Manisha");

        user1.start();
        user2.start();

        try {
            user1.join();
            user2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Balance : " + account.getBalance());
    }
}
