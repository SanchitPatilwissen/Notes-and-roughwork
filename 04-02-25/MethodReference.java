interface I {
    void abc();
}

interface J{
    Object getObject();
}

class A{
    public A(){
        System.out.println("From consructor A()");
    }

    public static void classMethod(){
        System.out.println("From static class method");
    }

    public void instanceMethod(){
        System.out.println("From instance method");
    }
}

class B{
    public static void demo(){
        System.out.println("From B class demo() method");
    }
}

class C{
    C(){
        System.out.println("C class object created");
    }
    public String toString(){
        System.out.println("From C class object");
        return "";
    }
}

public class MethodReference {
    public static void main(String[] args) {
        I i1 = A::classMethod; //method reference
        i1.abc();

        I i2 = new A()::instanceMethod;
        i2.abc();

        I i3 = A::new;
        i3.abc();

        I i4 = B::demo;
        i4.abc();

        J j1 = C::new;
        Object obj = j1.getObject();
        System.out.println(obj);

        J j2 = Thread::new;
        System.out.println(j2.getObject());
    }
}
