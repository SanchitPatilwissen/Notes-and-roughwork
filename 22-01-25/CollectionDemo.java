import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        // Map with Generics
        HashMap<Integer, String> obj = new HashMap<Integer, String>();
        obj.put(21, "Sanchit");
        obj.put(22, "Kaif");
        obj.put(23, "Sarvesh");
        obj.put(24, "Omkar");
        obj.put(25, "Shoyab");

        Set<Entry<Integer, String>> st = obj.entrySet();
        Iterator it = st.iterator();

        while(it.hasNext()){
            
        }
    }
}
