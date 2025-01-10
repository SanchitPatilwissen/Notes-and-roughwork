
class A{
    static int x;

    static void display(){
        System.out.println(x);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        a1.x = 10;
        a2.x = 20;
        a3.x = 30;

        System.out.println(a1.x);
        System.out.println(a2.x);
        System.out.println(a3.x);

    }

    static{ // Static block
        System.out.println("From static block!");
    }
}
