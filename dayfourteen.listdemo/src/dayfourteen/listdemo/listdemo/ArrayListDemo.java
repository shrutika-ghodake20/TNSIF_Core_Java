package dayfourteen.listdemo.listdemo;

import java.util.ArrayList
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List list=new ArrayList(); //dynamic binding
		
		System.out.println(list.isEmpty());
	}
	
	list.add(10);
	list.add(20);
	list.add("Sakshi");
	list.add(false);
	list.add(true);
	list.add(20);
	list.add(10.30f);
	list.add(10);
	
	System.out.println("List is" +list);
	System.out.println(list.isEmpty());
	
	System.out.println(list.size());
	System.out.println(list.contains(1));
	
	list.remove(false);
	System.out.println(list);
	
	System.out.println(list.remove(list.lastIndexof(20)));
	
	System.out.println(list);
	
	System.out.println(listindexof(20));
	
	list.clear();
	
	
	
	//generics\
	List<String> name=new ArrayList<String>();
	name.add("heti");
	name.add("hemla");
	name.add("aditya");
	name.add("jay");
	name.add("akshay");
	
	System.out.println(names);
	
	Collections.reverse(names);
	System.out.println(names);
	
	Collections.sort(names);
	System.out.println(names);
	
	Collections.reverse(names);
	System.out.println(names);
	
	//by using iteratior traversing in list
	
	Iterator<String> i=names.iterator();
	while(i.hastnext())
	{
		String nm=i.next();
		System.out.println(nm+"   ");
	}
	
	
	System.out.println();
	System.out.println(names);
	
	ListIterator<String> li=names.ListIterator(names.size());
	
	while(li.hasprevious())
	{
		String nm=li.previous();
		System.out.println();
	}
	
	

}
