class A extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(this+" Anita : "+i);
            try{
                Thread.sleep(300);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            // System.out.println(this+" Babita : "+i);
            System.out.println(Thread.currentThread().getName()+" Babita : "+i);
            try{
                Thread.sleep(700);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class C extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(this+" Chetna : "+i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

// Thread.sleep() method used to stop the thread for some time

public class ThreadDemo throws InterruptedException
{
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        a1.start();
        b1.start();
        c1.start();

        for(int i=1;i<=20;i++){
            System.out.println("Main : "+i);
            if(i==5)
                b1.suspend();
            if(i==18)
                b1.resume();

            Thread.sleep(300);
        }

        a1.join();
        c1.join();

        System.out.println("-----------------------------EXIT--------------------------------------------");

    }
}
