import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            list.add(11*i);
        }

        // 1) Finding all the records which are even --> Filter : Gives us those values where condition is true

        Predicate<Integer> p = (x) -> x%2==0;

        // Stream<Integer> s = list.stream().filter(p);

        // list = s.collect(Collectors.toList());

        System.out.println(list);

        // 2) Doubling the values --> map : Used to perform some operations on the values

        System.out.println(list.stream().map((x)-> x*2).collect(Collectors.toList()));

        System.out.println(list.stream().filter(p).map((x)-> x*2).sorted().limit(3).skip(2).collect(Collectors.toList()));

        // 3) Generating a stream of random numbers 

        Random random = new Random();

        random.ints().map(x->Math.abs(x)).limit(5).forEach(System.out::println);

        // 4) Generating a stream of random number in a specific range

        IntStream.range(1, 10).forEach(System.out::println);

        // 5) Calculating addition/multiplication of all numbers using reduce function in stream

        System.out.println(IntStream.range(1, 6).reduce((a, b)->a*b).getAsInt());

        // 6) Providing a starting value in reduce
        System.out.println(Stream.of(1, 2, 3).reduce(10, (a, b)->a+b));

        // 7) Finding summary on numerical class 
        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();
        System.out.println(stats);
        System.out.println(stats.getAverage()); // In this way we can extract individual datatypes in the object
    }    
}
