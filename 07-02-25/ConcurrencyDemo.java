import java.util.concurrent.*;

class Shared{
    static int count = 0;
}

class IncThread extends Thread{
    String name;
    Semaphore sem;

    IncThread(String name, Semaphore sem){
        this.name = name;
        new Thread(this).start();
        this.sem = sem;
    }

    public void run(){
        try {
            System.out.println(name + " is waiting to get the permission.....");
            sem.acquire();
            for(int i=1;i<=5;i++){
                System.out.println(name + " : "+(++Shared.count));
                Thread.sleep(200);
            }
            System.out.println(name + " has released the permission.....");
            sem.release();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class DecThread extends Thread{
    String name;
    Semaphore sem;

    DecThread(String name, Semaphore sem){
        this.name = name;
        new Thread(this).start();
        this.sem = sem;
    }

    public void run(){
        try {
            System.out.println(name + " is waiting to get the permission.....");
            sem.acquire();
            for(int i=1;i<=5;i++){
                System.out.println(name + " : "+(--Shared.count));
                Thread.sleep(200);
            }
            System.out.println(name + " has released the permission.....");
            sem.release();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ConcurrencyDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);

        new IncThread("Sanchit", sem);
        new DecThread("Kunal", sem);
        new IncThread("Salman", sem);
        new DecThread("Mukesh", sem);
    }
}
/*
There are 2 types 
-> 1) Synchronization block (mutex) -> Runs 1 thread at a time in synchronized manner.
-> 2) Semaphores -> Can run multiple threads at a time in sync.
 */