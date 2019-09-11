package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h = new Hashtable();
		h.put("a", "Test");
		h.put("b", "Hello");
		h.put("c", "World");

		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);

		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("c"));

        h.put(3,"Tom");
        h.put(4, "Dick");
		System.out.println(h.get(4));

		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
	h1.put(5,500);
	Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
h2.put(6, "Harry");
	}

}
