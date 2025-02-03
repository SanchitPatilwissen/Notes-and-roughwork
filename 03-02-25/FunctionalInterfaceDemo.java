@FunctionalInterface
interface I{
    public void abc();
    public boolean equals(Object obj);
    public int hashCode();
}

class A implements I {
    public void abc(){
        System.out.println("From A class abc method");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        I i1 = new A();
        i1.abc();

        I i2 = new I() {
            public void abc(){
                System.out.println("From anonymous class method abc!");
            }
        };

        i2.abc();

        I i3 = () -> System.out.println("From Lambda function!"); // Lambda expressions are added in java because (1) Security
        i3.abc();
    }
}