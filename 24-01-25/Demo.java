public class Demo {

    Demo(){
        System.out.println("From constructor");
    }

    Demo(int x){
        System.out.println("From parameterized constructor!");
    }

    {
        System.out.println("From init block"); // Just like a constructor. It is always executed when object is created even in the case of constructor overloading.
    } // Common logic is put in this incase of constructor overloading

    static{
        System.out.println("From static block");
    }
    public static void main(String[] args) {
        System.out.println("From main block");

        Demo d1 = new Demo();
        Demo d2 = new Demo(5);

    }
}
