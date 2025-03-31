package pack1;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdemo {
	
	public static int getSize(Iterator ob) {
		
		int count =0;
		while(ob.hasNext())
		{
			count++;
			ob.next();
		}
		return count;
	}
	
	public static void main (String [] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		  System.out.println("array list size:" + list1.size());
			
		
	    list1.add(67);
	    list1.add(57);
	    list1.add(47);
	    list1.add(77);
	    list1.add(97);
	    
	    System.out.println("List 1 :" + list1);
		
	    System.out.println("array list size:" + list1.size());
	    
	    ArrayList list2= new ArrayList();
	    
	    list2.add(78);
	    list2.add("Aman");
	    
	    System.out.println("List 2 :" + list2);
	    
	    
	   list1.add(1,100);
	   
	   System.out.println("array list size:" + list1);
	   list1.addFirst(20);
	   list1.addLast(700);
	   
	   System.out.println("List 1 :" + list1);
	   
		ArrayList<Integer> list3 = new ArrayList<Integer>();
	    
		for(int i=100;i<=105;i++) list3.add(i);
		
		  System.out.println("List 3 :" + list3);
		  
//		  list1.addAll(list3);
		  list1.addAll(2,list3);
		  System.out.println("List 1 :" + list1);
		  
		  
		  Iterator itr = list1.iterator();

		  System.out.println("Size :"+ getSize(itr));
		  
		  int sum =0;
		  
		  while(itr.hasNext()){
			  int value = (int) itr.next();
		  System.out.println("value :" + value);
		  sum += value; 
		  }

		  System.out.println("Sum:" + sum);
			
	}
	

}
