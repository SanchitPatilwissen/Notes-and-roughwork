import java.util.concurrent.*;

public class ScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(()-> System.out.println("Task executed after 5 second delay!"),
        5,
        TimeUnit.SECONDS); 
        scheduler.shutdown();
    }
}
