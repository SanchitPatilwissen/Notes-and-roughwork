
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        // 1) Vector

        Vector v1 = new Vector<>(2);
        v1.add("v1");
        v1.add(23);
        v1.add(2.34);
        Enumeration e = v1.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
        System.out.println("----------------------------------------------------------------");

        // 2) HashSet

        // HashSet obj = new HashSet<>();
        LinkedHashSet obj = new LinkedHashSet<>();

        obj.add("222");
        obj.add("111");
        obj.add("333");

        Iterator it = obj.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------------------------------------------------");

        // 3) TreeSet

        TreeSet obj2 = new TreeSet<>();


        obj2.add("222");
        obj2.add("111");
        obj2.add("333");

        it = obj2.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // for(var ele : obj2){
        //     System.out.println(ele);
        // }

        System.out.println("\n________________________________________________________________________________________________");
		System.out.println("LinkedHashSet");

		LinkedHashSet set2 = new LinkedHashSet();
		set2.add(1);
		set2.add(2);
		set2.add("Hello");
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(1);

		Iterator i2 = set2.iterator();
		while(i2.hasNext()){
			System.out.print(i2.next()+", ");
		}

	System.out.println("\n________________________________________________________________________________________________");
		System.out.println("ArrayList");

		ArrayList set3 = new ArrayList();
		set3.add(1);
		set3.add(2);
		set3.add("Hello");
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(1);
		//set3.addFirst(10);	//Not supported
		//set3.add(3, "Middle");

		Iterator i3 = set3.iterator();
		while(i3.hasNext()){
			System.out.print(i3.next()+", ");
		}	

	System.out.println("\n________________________________________________________________________________________________");
		System.out.println("LinkedList");

		LinkedList set4 = new LinkedList();
		set4.add(1);
		set4.add(2);
		set4.add("Hello");
		set4.add(3);
		set4.add(4);
		set4.add(5);
		set4.add(1);
		set4.addFirst(10);
		set4.add(3, "Middle");

		Iterator i4 = set4.iterator();
		while(i4.hasNext()){
			System.out.print(i4.next()+", ");
		}

	System.out.println("\n________________________________________________________________________________________________");
		System.out.println("PriorityQueue");

		PriorityQueue set5 = new PriorityQueue();
		set5.add(1);
		set5.add(2);
		//set5.add("Hello"); //Similar error as TreeSet
		set5.add(3);
		set5.add(4);
		set5.add(5);
		set5.add(1);
		//set5.addFirst(10);
		//set5.add(3, "Middle");

		Iterator i5 = set5.iterator();
		while(i5.hasNext()){
			System.out.print(i5.next()+", ");
		}

	System.out.println("\n________________________________________________________________________________________________");
		System.out.println("ArrayDeque");

		ArrayDeque set6 = new ArrayDeque();
		set6.add(1);
		set6.add(2);
		set6.add("Hello");
		set6.add(3);
		set6.add(4);
		set6.add(5);
		set6.add(1);
		//set5.addFirst(10);
		//set5.add(3, "Middle");

		Iterator i6 = set6.iterator();
		while(i6.hasNext()){
			System.out.print(i6.next()+", ");
		}

	System.out.println("\n________________________________________________________________________________________________");
		System.out.println("Hashtable");

		Hashtable map = new Hashtable();
		
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");
		map.put("4", "D");
		map.put("5", "E");
		//map.put(null, "F");		//Error NullPointerException
		//map.put("6", null);		//Error NullPointerException
		
		Set s = map.entrySet();
		Iterator i7 = s.iterator();
		while(i7.hasNext()){
			//System.out.print(i7.next()+", "+);
			//Alternatively we can use
		
			Map.Entry me = (Map.Entry)i7.next();
			System.out.println("Key = "+me.getKey()+", value = "+me.getValue());
		}

		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("HashMap");

		HashMap map1 = new HashMap();
		
		map1.put("1", "A");
		map1.put("2", "B");
		map1.put("3", "C");
		map1.put("4", "D");
		map1.put("5", "E");
		map1.put("6", null);
		map1.put(null, "G");
		
		Set s1 = map1.entrySet();
		Iterator i8 = s1.iterator();
		while(i8.hasNext()){
			//System.out.print(i8.next()+", "+);
			//Alternatively we can use
		
			Map.Entry me1 = (Map.Entry)i8.next();
			System.out.println("Key = "+me1.getKey()+", value = "+me1.getValue());
		}

		System.out.println("\n________________________________________________________________________________________________");
		System.out.println("TreeMap");

		TreeMap map2 = new TreeMap();
		
		map2.put("1", "A");
		map2.put("2", "B");
		map2.put("3", "C");
		map2.put("4", "D");
		map2.put("5", "E");
		map2.put("0", "X");
		//map2.put(null, "G");
		
		Set s2 = map2.entrySet();
		Iterator i9 = s2.iterator();
		while(i9.hasNext()){
			//System.out.print(i9.next()+", "+);
			//Alternatively we can use
		
			Map.Entry me2 = (Map.Entry)i9.next();
			System.out.println("Key = "+me2.getKey()+", value = "+me2.getValue());
		}

	System.out.println("\n________________________________________________________________________________________________");
		System.out.println("LinkedHashMap");

		LinkedHashMap map3 = new LinkedHashMap();
		
		map3.put("1", "A");
		map3.put("2", "B");
		map3.put("3", "C");
		map3.put("4", "D");
		map3.put("5", "E");
		map3.put("6", null);
		map3.put(null, "G");
		
		Set s3 = map3.entrySet();
		Iterator i10 = s3.iterator();
		while(i10.hasNext()){
			//System.out.print(i10.next()+", "+);
			//Alternatively we can use
		
			Map.Entry me3 = (Map.Entry)i10.next();
			System.out.println("Key = "+me3.getKey()+", value = "+me3.getValue());
		}

    }
}   
