import java.io.*;

class Person implements Serializable{

    private String name;
    private int age;

    private int salary;

    Person(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display(){
        System.out.println(name+", "+age+", "+salary);

    }

}

class Serialization{
    static void write() throws Exception{
        Person p = new Person("Sanchit", 24, 1000000);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(p);
    }

    static void read() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person p = (Person)ois.readObject();
        p.display();
    }
}

public class ReadWriteFile {
    public static void main(String[] args) throws Exception{
        // Serialization.write();
        Serialization.read();
    }
}
