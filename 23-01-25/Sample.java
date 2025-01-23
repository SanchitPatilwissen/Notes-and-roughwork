
class Animal{
    int x = 10;
    Animal(){}
    Animal(int x){
        this.x = x;
    }
    Animal get(){
        return this;   
    }
    void display(){
        System.out.println("Value of Animal is "+x);
    }
}

class Dog extends Animal{
    Dog(){

    }
    Dog get(){
        return this;
    }
    void display(){
        System.out.println("Value of Dog is "+x);
    }
} 

public class Sample {
    public static void main(String[] args) {
        Animal a = new Animal(50);
        Animal b = a.get();
        Animal c = new Dog();
        Animal d = c.get();
        b.display();
        d.display();
    }
}
