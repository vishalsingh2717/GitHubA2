package generic_collection;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(52);
		System.out.println(al);
		
		System.out.println(al.contains(10));
		
		LinkedList lt=new LinkedList<String>();
		lt.add("hello");
		System.out.println(lt.add("gopal"));
		System.out.println(lt);
		
		System.out.println("=============");
		
		Vector<Object> vo=new Vector();
		vo.add(al);
		vo.add(lt);
		System.out.println(vo);
		vo.addAll(lt);
		vo.addAll(al);
		System.out.println(vo);
		System.out.println(vo.size());
		vo.remove(al);
		System.out.println(vo);
		vo.removeAll(lt);
		System.out.println(vo);
		System.out.println("===========");
		vo.retainAll(vo);
//		vo.retainAll(lt);
		System.out.println(vo);
		vo.clear();
		System.out.println(vo);
		vo.retainAll(vo);
		System.out.println(vo);
		System.out.println(vo.size());

	}

}
