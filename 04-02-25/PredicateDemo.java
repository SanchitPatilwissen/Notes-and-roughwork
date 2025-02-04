import java.util.function.*;

// Reusing logic

public class PredicateDemo {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        Predicate<Integer> p1 = (x) -> x%2==0;
        Predicate<Integer> p2 = (x) -> x>50;
        process(arr, p1); // To print even numbers
        process(arr, p1.negate()); // To print odd numbers
        process(arr, p2); // To print numbers above 50
        process(arr, p1.and(p2)); // To print even numbers above 50
    }

    public static void process(int arr[], Predicate<Integer> p){
        for(int i=0;i<arr.length;i++){
            if(p.test(arr[i]))
                System.out.println(arr[i]);
        }
        System.out.println("-------------------------");
    }
}
