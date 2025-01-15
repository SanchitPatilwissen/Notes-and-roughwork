
import java.io.*;

// final class Student implements Serializable{
//     private final int rollno;
//     private final String name;
//     private final int std;

//     Student(int rn, String nam, int st){
//         rollno = rn;
//         name = nam;
//         std = st;
//     }

//     public String toString(){
//         return "Student[Roll no. : "+rollno+", Name : "+name+", Std : "+std+"]";
//     }
// }

record Student(int rollno, String name, int std) {
    private static String schoolName = "DPS";

    Student(){
        this(22, "Sancho", 4);
    }

    Student(int rollno, String name, int std){
        this.rollno = rollno;
        this.name = name;
        this.std = std;
    }

    String schoolName(){
        return schoolName;
    }

    // We can also override hashcode and equals methods.

}

public class ImmutableClass{
    public static void main(String[] args) {
        Student s1 = new Student(10, "Sancho", 10);
        Student s2 = new Student(123, "Jayden", 2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.schoolName());
        System.out.println(s2.schoolName());
    }
}