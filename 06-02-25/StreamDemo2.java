import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {

        // Workin with map in streams

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(11, "Rakesh");
        map.put(22, "Rajesh");
        map.put(33, "Ramesh");
        map.put(44, "Suresh");
        map.put(55, "Viraj");

        map.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
        map.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        map.entrySet().stream().filter(me->me.getKey()>30).forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6, 7);
        List<Integer> l3 = Arrays.asList(8, 9, 10);

        List<List<Integer>> list = Arrays.asList(l1, l2, l3);
        System.out.println(list);

        List<Integer> flatlist = list.stream().flatMap(lst->lst.stream).map(x->x*2).collect(Collectors.toList());
        System.out.println(flatlist);

        list.stream().flatMap(lst -> lst.stream()).map(x->x*2).forEach(System.out::println);
    }
}
