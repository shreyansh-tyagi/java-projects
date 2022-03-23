import java.util.*;
public class QueueDeque {
	static String name;
	QueueDeque(String s){
		QueueDeque.name=s;
	}
	public Queue<String> queue(){
		Queue<String> q=new PriorityQueue<String>();
		q.add(name);
		q.add("adding the element in queue");
		return q;
		
	}
	public  Deque<String> deque(){
		Deque<String> d=new ArrayDeque<String>();
		d.add(name);
		d.add("adding the element in deque");
		return d;
	}

}
class Mainqueue extends QueueDeque{
	Mainqueue(String s){
		super(s);
	}
	public static void main(String args[]) {
		QueueDeque q=new QueueDeque("shrey tyagi");
		Queue<String> qu=q.queue();
		Deque<String> de=q.deque();
		System.out.println("this is queue");
		for(String s:qu) {
			System.out.print(s);
		}
		System.out.println("head-> "+qu.element());
		System.out.println("head-> "+qu.peek());
		for(String s1:de) {
			System.out.print(s1);
		}
	}
}
