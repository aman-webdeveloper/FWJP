package pack1;

import java.util.Arrays;
import java.util.LinkedList;
public class firstexample {

	public static void main(String []args) {
		LinkedList<Integer>  list1 = new LinkedList<Integer>();
		LinkedList<Integer>  list2 = new LinkedList<Integer>();
		
		
		list1.add(45);
		list1.add(35);
		list1.add(75);
		list1.add(85);
		list1.add(25);
		list1.add(15);
//		System.out.println("values in list :"+list1);
		
//		list1.remove();
//		System.out.println("values in list :"+list1);

		
		list2.add(85);
		list2.add(55);
		list2.add(75);
		
//		System.out.println("List 2 :"+list2);
//		list1.removeAll(list2);
		
//		System.out.println("values in list :"+list2);
		
		list1.removeIf(x->(x%2==0));
//		System.out.println("values in list :"+list1);
		
//	Search in linked list > contain()
		
		list1.addAll(list2);
		
		System.out.println("contains  55 "+list1.contains(55));
		
//		to retreive the element from the lost 
		System.out.println("List 1 :"+list1);
		System.out.println("elements : "+list1.element());
		
		System.out.println("value at index 3  :"+list1.get(3));
		
//		getfirst() and getlast()
		
//		to get the index of an element  : indexof()
		System.out.println("Index of 25 :"+list1.indexOf(25));
		
//		convert a linked list inot an array > to Array()
		
//		Object x[]=list1.toArray();
//		for(Object i:x) System.out.println(i);
		
//		Integer[]x[] = list1.Array(new Integer[0]);
		
//		int x[]= Arrays.stream(List1.toArray().maptoInt(Integer :: intvalue).toArray());
		
//		print the array
		
//		int x[] array = Arrays.stream(list1.toArray(new Integer[0])
//		.mapToInt(Integer::intValue).toArray());
//		
//		for(int i:x) System.out.println(i);
		
		int x[] = Arrays.stream(list1.toArray(new Integer[0])).
				mapToInt(Integer::intValue).toArray();
		for(int i:x) System.out.println(i);

	
		
		
		
	}
	
}
