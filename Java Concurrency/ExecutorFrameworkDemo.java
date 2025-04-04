import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrameworkDemo {
    public static int factorial(int value){
        int result = 1;
        for(int i=1;i<=value;i++){
            result *= i;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // To handle InterruptedException.
        }
        return result;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(1);

        for(int i=0;i<10;i++){
            int finalI = i;
            Future<?> future = executor.submit(()->{
                long result = factorial(finalI+1);
                System.out.println("Factorial of "+(finalI+1)+" is "+result);
            });
        }
        executor.shutdown();
        try{
            executor.awaitTermination(100, java.util.concurrent.TimeUnit.SECONDS);
        }
        catch(InterruptedException e){ // InterruptedException is thrown by awaitTermination() method. So we have to handle it.
            Thread.currentThread().interrupt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken : "+(endTime-startTime));
    }
}
