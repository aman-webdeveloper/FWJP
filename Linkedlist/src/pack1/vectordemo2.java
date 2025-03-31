package pack1;

import java.util.Vector;

public class vectordemo2 {

	public static void main(String[] args) 
	{
		Vector<String> ob1 = new Vector<String>(); // 10
		Vector<String> ob2 = new Vector<String>(5); // 5
		Vector<String> ob3 = new Vector<String>(5, 4); // 5
		
		System.out.println("Size(ob1) : "+ob1.size());
		System.out.println("Size(ob2) : "+ob2.size());
		System.out.println("Size(ob3) : "+ob3.size());
		
		System.out.println("Capacity(ob1) : "+ob1.capacity());
		System.out.println("Capacity(ob2) : "+ob2.capacity());
		System.out.println("Capacity(ob3) : "+ob3.capacity());
		
		
		ob3.add("jatin");
		ob3.add("sumit");
		ob3.add("Varun");
		ob3.add("arun");
		ob3.add("jai");
		ob3.add("namit");
		
		System.out.println("ob3 : "+ob3);
		System.out.println("Size(ob3) : "+ob3.size());
		System.out.println("Capacity(ob3) : "+ob3.capacity());
		
		ob3.add("harsh");
		ob3.add("karan");
		ob3.add("babita");
		ob3.add("arun");
		ob3.add("jai");
		ob3.add("namit");
	
		System.out.println("ob3 : "+ob3);
		System.out.println("Size(ob3) : "+ob3.size());
		System.out.println("Capacity(ob3) : "+ob3.capacity());
	
//		forEach() : this function is used to traverse
		// all the elements of vector one by one
		
		ob3.forEach(System.out::println);
		
		// to reduce the capacity of a vector according to its size,
		// we can use trimToSize() function
		ob3.trimToSize();
		System.out.println("Size(ob3) : "+ob3.size());
		System.out.println("Capacity(ob3) : "+ob3.capacity());
	
		
		Vector<String> ob4 =new Vector<>(ob3.subList(2, 6));
		System.out.println("ob4 : "+ob4);
		
		
	}

}