package pack1;

import java.util.Stack;

public class stackdemo {

	public static void main (String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		st.add(45);
		st.push(20);
		st.push(320);
		st.push(250);
		st.push(260);
		
		System.out.println("stack :"+ st);

		System.out.println("pop :"+ st.pop());

		System.out.println("stack :"+ st);

		System.out.println("peek :"+ st.peek());
		

		System.out.println("stack :"+ st.search(20));

		System.out.println("stack :"+ st.empty());

		System.out.println("stack :"+ st.size());

		System.out.println("stack :"+ st.capacity());
		
		
		
		
	}
	
}
