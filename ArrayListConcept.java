package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());

		ar.remove(5);
		System.out.println(ar.size());

		
		ar.add("Tom");
		ar.add(12.33);
		ar.add('N');
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		//to print all the values of arraylist :for loop
		for(int i =0;i< ar.size(); i++){
			System.out.println(ar.get(i));

		}
  
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Hello");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hi");
	}

}
