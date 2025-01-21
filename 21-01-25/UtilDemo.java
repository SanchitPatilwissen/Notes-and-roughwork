import java.util.*;

public class UtilDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1); // prints current date and time
        Date d2 = new Date();
        d2.setTime(-999999999999L); // 32k milli secs after 01/01/1970 00:00:00
        System.out.println(d2);
        d1.setMonth(48);
        System.out.println(d1);
        System.out.println(d1.getYear()+1900);

        Stack s1 = new Stack<>();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);

        System.out.println(s1.peek());
        System.out.println(s1.peek());
        
        System.out.println(s1.search(5));
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        // Calendar c1 = new Calendar() {
            
        // }; It is an abstract class

        BitSet b1 = new BitSet(16);  // 0000 0000 0000 0000
        BitSet b2 = new BitSet(16);  // 0000 0000 0000 0000

        System.out.println(b1);
        for(int i=0;i<16;i++){
            if(i%3==0)
                b1.set(i);
            if(i%4==0)
                b2.set(i);
        }
        System.out.println(b1);
        System.out.println(b2);

        b1.and(b2); // can perform other boolean operations as well.
        System.out.println(b1);
    }
}
