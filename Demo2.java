package generic_collection;
import java.util.*;

public class Demo2 {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet();
		hs.add(15);
		hs.add(56);
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("========");
		
		LinkedHashSet ls=new LinkedHashSet<String>();
		ls.add("hy");
		ls.add("king");
		ls.add("2");
		System.out.println(ls);
		System.out.println("==========");
		
//		PriorityQueue<Object> ts=new PriorityQueue();
////		ts.add(new Demo2());
//		ts a=(ts)hs;
//		ts.add(hs);
//		ts.add(ls);
//		System.out.println(ts.size());
//		System.out.println(ts);
//		System.out.println("=======");
////		ts.addAll(ls);
////		ts.addAll(hs);
//		System.out.println(ts.size());
//		System.out.println(ts);
		
		
	}

}
