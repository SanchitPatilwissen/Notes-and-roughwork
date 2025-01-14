class A implements AutoCloseable{
    A(){
        System.out.println("** Allocating resources for A **");
    }

    void process(){
        System.out.println("Processing for A");
    }

    public void close(){
        System.out.println("** Closing the resources for A **");
    }
}

class B implements AutoCloseable{
    B(){
        System.out.println("** Allocating resources for B **");
    }

    void process(){
        System.out.println("Processing for B");
    }

    public void close(){
        System.out.println("** Closing the resources for B **");
    }
}

public class TryWithResources {
    public static void main(String[] args) {
        
        // A a1 = null;

        try(A a1 = new A(); B a2 = new B();){
            a1.process();
            a2.process();

            if(true)
                return;
                // throw new NullPointerException();
        }   
        catch(Exception e){
            System.out.println(e);
        }     
    }    
}
