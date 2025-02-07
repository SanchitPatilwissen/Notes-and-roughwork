import java.util.concurrent.*;

public class ConcurrencyDemo3 {
    public static void main(String[] args) throws Exception{
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Using SupplyAsync for String type : "+i);
            }
            return "Completed the String argument execution.....";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(s->"You delayed to give result");
        CompletableFuture.runAsync(()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Using runAsync : "+i);
            }
        });
        CompletableFuture<Double> cf2 = CompletableFuture.supplyAsync(()->{
            double res = 0;
            for(int i=1;i<=10;i++){
                System.out.println("Using SupplyAsync for Double type : "+i);
            }
            for(int j=1;j<=100;j++){
                res = res + j;
            }
            return res;
        });
        Thread.sleep(1000);
        cf2.thenApplyAsync((x)->{
            System.out.println("Summing till 100 is : "+x);
            return x;
        });
        System.out.println("Main Exit :) ");
        System.out.println("Result + "+cf1.get());
    }
}
