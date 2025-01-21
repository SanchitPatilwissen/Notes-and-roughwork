import java.util.*;


class A{
    int x;
    A(int x){
        this.x = x;
    }
    public void finalize(){
        System.out.println("Object with x value : "+x+" is getting removed!");
    }
}

public class LangDemo2 {
    public static void main(String[] args) throws Exception{
        A a1 = new A(10);
        A a2 = new A(20);
        A a3 = new A(30);

        // a2.finalize();
        a2 = a3;

        System.out.println(a1.x);
        System.out.println(a2.x);
        System.out.println(a3.x);

        System.gc();

        Thread.sleep(1000);

        Class c2 = a1.getClass();
        System.out.println(c2);

        System.out.print("Enter a class : ");
        Class c1 = Class.forName(new Scanner(System.in).next());
        Object obj = c1.newInstance();
        System.out.println(obj);
    }
}
