package pack1;
import java.util.Vector;


public class Vectordemo {
	public static void main(String []args) {
		Vector<String> ob1 = new Vector<String>();
		Vector<String> ob2 = new Vector<String>(5);
		Vector<String> ob3 = new Vector<String>(5,4);
		
		
		System.out.println("Size of ob1 : "+ob1.size());
		System.out.println("Size of ob2 : "+ob2.size());
		System.out.println("Size of ob3 : "+ob3.size());
		
		System.out.println("Size of ob1 : "+ob1.capacity());
		System.out.println("Size of ob2 : "+ob2.capacity());
		System.out.println("Size of ob3 : "+ob3.capacity());
		
		ob2.add("aman");
		ob2.add("ajay");
		ob2.add("arjun");
		ob2.add("vishu");
		ob2.add("ayush");
		ob2.add("nishu");
		
		System.out.println("Size of ob2 : "+ob2);
		System.out.println("Size of ob1 : "+ob2.size());
		
		
		ob2.add("aman");
		ob2.add("ajay");
		ob2.add("arjun");
		ob2.add("vishu");
		ob2.add("ayush");
		ob2.add("nishu");
		
		System.out.println("Size of ob2 : "+ob2.capacity());
		
		
				
	}

}
