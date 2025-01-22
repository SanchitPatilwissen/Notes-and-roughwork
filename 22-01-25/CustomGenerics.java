
class A<T, R>{
    public R add(T a, T b){
        return (R) "Generic Logic addition : ";
    }
}

// Generics are only used at compile time. Runtime it is not used.

public class CustomGenerics {
    public static void main(String[] args) {
        A a = new A<>();
        Object x = a.add(1, 2);
        System.out.println(x);
        A<Integer, String> b = new A<Integer, String>();
        Object y = b.add(23, 34);
        System.out.println(y);
        A<Double, String> c = new A<Double, String>();
        Object z = c.add(23.4, 34.2);
        System.out.println(z);
    }
}
