package dayfourteen.listdemo.listdemo;

import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		
		Queue<Integer> r=new LinkList<Integer>();
		
		r.add(6);
		r.add();
		r.add(13);
		r.add(2);
		
		System.out.println(r);
		
		int positionPeek = r.peek();
		System.out.println("using peek methos forst value form");
		
		int positionPeek = r.element();
		System.out.println("using peek methos forst value form");
		
		Iterator itr=r.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next);
		}
	}
}
