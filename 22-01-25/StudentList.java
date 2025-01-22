import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable{
    int rollno;
    String name;
    int std;

    public Student(int rollno, String name, int std){
        this.rollno = rollno;
        this.name = name;
        this.std = std;
    }

    public String toString(){
        String ans = "";
        ans += rollno;
        ans += ", ";
        ans += name;
        ans += ", ";
        ans += std;
        return ans;
            
    }

    public int hashCode(){
        return std;
    }

    public boolean equals(Object obj){
        Student s = (Student)obj;
        if((s.rollno == this.rollno) && (s.std == this.std))
            return true;
        return false;
    }

    public int compareTo(Object obj){
        Student s = (Student)obj;
        return new Integer(rollno).compareTo(s.rollno)*(1);
    }
}

class NameSorter implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class RollNoSorter implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return new Integer(s1.rollno).compareTo(s2.rollno);
    }
}

class StdSorter implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return new Integer(s1.std).compareTo(s2.std);
    }
}

public class StudentList {
    public static void main(String[] args) {
        // HashSet hs = new HashSet();
        TreeSet hs = new TreeSet(new NameSorter());

        hs.add(new Student(1, "Sanchit Patil", 10));
        hs.add(new Student(2, "Kaif Ali", 10));
        hs.add(new Student(3, "Sarvesh", 10));
        hs.add(new Student(4, "Omkar Shirwadkar", 10));
        hs.add(new Student(5, "Shoyab Siddique", 10));
        hs.add(new Student(6, "Aditya Shirodkar", 10));
        hs.add(new Student(6, "Manthan Shirodkar", 10));


        Iterator it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
