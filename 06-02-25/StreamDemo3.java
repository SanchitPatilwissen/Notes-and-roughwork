import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<Emp>();

        list.add(new Emp("Sanchit", 21, 100000, "MANAGER"));
        list.add(new Emp("Manju", 41, 70000, "PROGRAMMAR"));
        list.add(new Emp("Sanju", 31, 12000, "CLERK"));
        list.add(new Emp("Rishabh", 28, 20000, "TESTER"));
        list.add(new Emp("Rohit", 39, 30000, "TESTER"));
        list.add(new Emp("Shikhar", 40, 25000, "CLERK"));
        list.add(new Emp("Virat", 36, 30000, "TESTER"));
        list.add(new Emp("Rahul", 51, 5000, "CLERK"));
        list.add(new Emp("Gautam", 44, 25000, "PROGRAMMAR"));
        list.add(new Emp("Sunil", 58, 70000, "PROGRAMMAR"));
        list.add(new Emp("Sachin", 50, 100000, "MANAGER"));
        list.add(new Emp("Mukesh", 59, 100000, "MANAGER"));
        list.add(new Emp("Nita", 49, 60000, "PROGRAMMAR"));

        list.stream().filter((e)->e.salary>50000).forEach(System.out::println);

        System.out.println("--------------------Normal Group by-------------------------------------------------");

        Map<Boolean, List<Emp>> m1 = list.stream().collect(Collectors.partitioningBy(e->e.salary>50000));
        System.out.println("****POOR EMPLOYEES****");
        System.out.println(m1.get(false));
        System.out.println("****RICH EMPLOYEES****");
        System.out.println(m1.get(true));

        System.out.println("--------------------Counting in Group by-------------------------------------------------");

        Map<Boolean, Long> m2 = list.stream().collect(Collectors.partitioningBy(e->e.salary>50000, Collectors.counting()));
        System.out.println(m2);

        System.out.println("--------------------Normal Partition by-------------------------------------------------");

        Map<String, List<Emp>> m3 = list.stream().collect(Collectors.groupingBy(e->e.designation));
        System.out.println(m3);

        System.out.println("--------------------Counting in partition by-------------------------------------------------");
        Map<String, Long> m4 = list.stream().collect(Collectors.groupingBy(e->e.designation, Collectors.counting()));
        System.out.println(m4);

        System.out.println("--------------------Displaying names-------------------------------------------------");
        Map<String, List<String>> m5 = list.stream().collect(Collectors.groupingBy(e->e.designation, Collectors.mapping(e->e.name, Collectors.toList())));
        System.out.println(m5);

    }
}

class Emp{
    String name;
    int age;
    double salary;
    String designation;

    Emp(String name, int age, double salary, String designation){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    public String toString(){
        String ans = "Name : "+name+", Age : "+age+", Salary : "+salary+", Designation : "+designation;
        return ans;
    }
}