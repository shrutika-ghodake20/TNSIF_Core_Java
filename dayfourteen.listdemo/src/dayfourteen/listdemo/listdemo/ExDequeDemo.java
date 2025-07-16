package dayfourteen.listdemo.listdemo;

public class ExDequeDemo {
	public static void main(String[] args) {
		
		Deque<String> Deque1=new ArrayDeque<String>();
		deque.add("gautami");
		deque.add("Kiran");
		deque.add("Shreya");
		deque1.add("shreya");
		deque1.add("heti");
		
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque);
		
		deque1.pollFirst();
		System.out.println(deque);
		
		for(String str : deque1)
		{
			System.out.println("queue is : " +str);
		}
		System.out.println(deque1);
		
	}

}
