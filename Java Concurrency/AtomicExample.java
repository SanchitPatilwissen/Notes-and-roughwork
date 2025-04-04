
import java.util.concurrent.atomic.AtomicInteger;

class Resource{
    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}

public class AtomicExample {
    public static void main(String[] args) {
        Resource r = new Resource();
        Thread t1 = new Thread(()->{
            for(int i=0;i<10000;i++){
                r.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<10000;i++){
                r.increment();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(r.getCount());
    }
}
