import java.util.*;
public class QueueDeque {
	static String name;
	QueueDeque(String s){
		QueueDeque.name=s;
	}
	public static Queue<String> queue(){
		Queue<String> q=new PriorityQueue<String>();
		q.add(name);
		return q;
		
	}

}
