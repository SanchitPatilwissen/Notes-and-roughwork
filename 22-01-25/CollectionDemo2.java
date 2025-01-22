import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        List list = new LinkedList<>();

        list.add("333");
        list.add("222");
        list.add("555");
        list.add("111");
        list.add("444");
        list.add("000");

        System.out.println(list);
        // Collections.reverse(list);
        Collections.swap(list, 2, 5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
