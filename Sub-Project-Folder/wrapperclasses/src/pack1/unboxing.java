package pack1;

public class unboxing {
public static void main(String args[] ) {
	int a=100;
	Integer ob = a;
	
	Integer obj = 33;
	int b=obj;
	
	
	System.out.println(ob);
	System.out.println(obj);
	
	Integer y = 34;
//	y=y+10;
	Integer q =y;
	System.out.println(y);
	System.out.println("y : " +y.hashCode());
	System.out.println("y : " +System.identityHashCode(y));
	System.out.println("q : " +q.hashCode());
	System.out.println("y : " +System.identityHashCode(q));
	
	y=q+10;
	System.out.println(q);
	System.out.println("q : " +q.hashCode());
	System.out.println("y : " +System.identityHashCode(q));
	
	

}
}


