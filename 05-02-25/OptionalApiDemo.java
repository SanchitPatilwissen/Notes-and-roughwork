import java.util.Optional;

public class OptionalApiDemo {
    public static void main(String[] args) {
        Integer i1 = null;
        Integer i2 = 20;

        Optional<Integer> o1 = Optional.ofNullable(i1);
        Optional<Integer> o2 = Optional.ofNullable(i2);

        add(o1, o2);
    }

    public static void add(Optional<Integer> a, Optional<Integer> b){
        Integer i1 = a.orElse(0);
        Integer i2 = b.orElse(0);
        System.out.println(i1+i2);
    }
}
