
class SharedResource{
    private int data;
    private boolean hasData;

    public synchronized void produce(int value){
        while(hasData){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        this.data = value;
        hasData = true;
        System.out.println("Producing : "+data);
        notify();
    }

    public synchronized int consume(){
        while(!hasData){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        notify();
        System.out.println("Consuming : "+data);
        return data;
    }
}

class Producer implements Runnable{
    private SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable{
    private SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producer = new Thread(new Producer(resource));
        Thread consumer = new Thread(new Consumer(resource));
        producer.start();
        consumer.start();
    }
}
