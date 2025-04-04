
import java.util.concurrent.*;

public class CountDownLatchDemo {
    public static void main(String[] args) throws Exception{
        int numberOfServices = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        CountDownLatch latch = new CountDownLatch(numberOfServices);

        // Future<String> future1 = executorService.submit(new DependentService());
        // Future<String> future2 = executorService.submit(new DependentService());
        // Future<String> future3 = executorService.submit(new DependentService());

        Future<String> future1 = executorService.submit(new DependentService(latch));
        Future<String> future2 = executorService.submit(new DependentService(latch));
        Future<String> future3 = executorService.submit(new DependentService(latch));

        // future1.get();
        // future2.get();
        // future3.get();

        latch.await();
        // latch.await(5, TimeUnit.SECONDS);

        System.out.println("All services finished. Starting main service");

        executorService.shutdown();
    }
}

class DependentService implements Callable<String>{
    
    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch){this.latch = latch;} // Constructor with latch as parameter.

    @Override
    public String call() throws Exception {
        try{
            System.out.println(Thread.currentThread().getName()+" service started");
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();    
        }
        finally{
            latch.countDown();
        }
        return "ok";
    }
}