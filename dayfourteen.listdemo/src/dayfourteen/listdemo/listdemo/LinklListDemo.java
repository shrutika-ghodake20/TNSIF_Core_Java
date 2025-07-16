package dayfourteen.listdemo.listdemo;



public class LinklListDemo {
	
	public static void main(String[] args) {
		
		
		LinkList<Integer> li=new LinkList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(40);
		li.add(50);
		System.out.println(li);
		li.addFirst(5);
		li.add(2,60);
		System.out.println(li);
		
		li.addLast(20);
		System.out.println(li);
		
		
		System.out.println(li.getfirst());
		System.out.println(li.getlast());
		
		li.removeFirst();
		li.removelast();
		System.out.println(println(li));
		
		Iterator<Integer> ll=li.listIterator();
		ehile(ll.hasNext())
		System.out.println(ll.next()+"\t");
		
		System.out.println();
		ll=li.listIterator(li.size());
		while(ll.hasPrevious())
		{
			int n=11.previous();
			System.out.println(n+"\t");vc
		}
	}

}
