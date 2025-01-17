class A implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is waiting for permission");
        synchronized(this){
            System.out.println(Thread.currentThread().getName()+" has got permission");
            for(int i=1;i<=20;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                try{
                    Thread.sleep(300);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
    
}

public class SyncDemo {
    public static void main(String[] args) {
        A a1 = new A();

        ThreadGroup tg = new ThreadGroup("Demo");

        Thread t1 =new Thread(tg, a1);
        Thread t2 =new Thread(tg, a1);
        Thread t3 =new Thread(tg, a1);

        t1.setName("Sanchit");
        t2.setName("Vikas");
        t3.setName("Rakesh");

        // t2.setDaemon(true);

        for(int i=0;i<10;i++){
            System.out.println("Main : "+i);
            if(i == 5)
                tg.suspend();
        }

        t1.start();
        t2.start();
        t3.start();

    }
}
