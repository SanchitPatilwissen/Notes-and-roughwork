// package abc.xyz.com;
package p1;

public class A {

    public int x = 10;
    private int y = 20;
    protected int z = 30;
    int b = 40; 

    public static void main(String[] args){
        // System.out.println("Hello! I am coming from package 1");

    }    

    public void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);

    }
}

class B extends A{
    public void display(){
        System.out.println(x);
        // System.out.println(y);
        System.out.println(z);
        System.out.println(b);
    }
    
}

class C{
    public void display(){
        A a1 = new A();
        System.out.println(a1.x);
        // System.out.println(a1.y);
        System.out.println(a1.z);
        System.out.println(a1.b);
    }
}

