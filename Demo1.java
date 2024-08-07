package map_hierarchy;

import java.util.*;


public class Demo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1, "king");
		hm.put(2, "king2");
		hm.put(3, "king3");
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		Collection c1=hm.values();
		System.out.println(c1);
		
		Set s=hm.keySet();
		System.out.println(s);
		
		Set s1=hm.entrySet();
		System.out.println(s1);
		
		hm.put(4,"gopal");
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.get(4));
		System.out.println("===========");
		
		LinkedHashMap lh=new LinkedHashMap<String,Integer>();
		lh.put("gaurav", 2);
		lh.put(10, "gopal");
		System.out.println(lh);
		
	}

}
