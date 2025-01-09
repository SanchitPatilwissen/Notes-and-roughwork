interface X {

    int a = 50;

    void add();
    void sub();
}

interface Y {
    int b = 100;

    void mul();

    void div();
    
}

interface Z extends X, Y{
    
}

class Calculator implements Z{
    public void add(){
        System.out.println("The addition is "+(Z.a+Z.b));
    }

    @Override
    public void sub() {
        System.out.println("The addition is "+(Z.a-Z.b));
    }

    @Override
    public void mul() {
        System.out.println("The addition is "+(X.a*Y.b));
    }

    @Override
    public void div() {
        System.out.println("The addition is "+(X.a/Y.b));
    }
}

public class Interfaces{
    public static void main(String[] args){
        Calculator c1 = new Calculator();

        X x1 = c1;
        x1.add();
        x1.sub();

        Y y1 = c1;
        y1.mul();
        y1.div();

        System.out.println("-------------------------------------------------------------------------");

        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
    }
}