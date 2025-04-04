class SharedObj{
    private volatile boolean flag = false; // volatile keyword is used to ensure that the value of flag is always read from the main memory. Hence shared cache is implemented using volatile keyword

    public void setTrue() {
        flag = true;
        System.out.println("Set flag to true");
    } 
    
    public void printIfTrue(){
        while(!flag){
    
        }
        System.out.println("Flag is true");
    }
}


public class VolatileExample{
    public static void main(String[] args) {
        SharedObj obj = new SharedObj();

        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            obj.setTrue();
        });

        Thread readerThread = new Thread(()->{
            obj.printIfTrue();
        });
        readerThread.start();
        writerThread.start();
    }
}