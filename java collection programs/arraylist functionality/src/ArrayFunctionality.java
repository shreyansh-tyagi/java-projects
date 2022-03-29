import java.util.*;
import java.util.Map.Entry;
//import java.lang.*;
import java.io.*;
public class ArrayFunctionality {
	String name,gender;
	int age;
	float salary;
	
	ArrayFunctionality(String n,String g,int a,float s){
		this.name=n;
		this.gender=g;
		this.age=a;
		this.salary=s;
	}

}



class Displays extends MainArray{
	public  void displaylist (List<String> linkedlist){
		System.out.println("\n\nupdated list after adding: ");
		linkedlist.forEach(a->{System.out.println(a);});
	}
	public void displayremove(List<String> linkedre) {
		System.out.println("\n\nupdated list after removing: ");
		linkedre.forEach(b->{System.out.println(b);});
	}
	public void displayreverse(List<String> linkrev) {
		System.out.println("\n\nupdated list afte reversing: ");
		linkrev.forEach(c->{System.out.println(c);});
	}
	public void displayset(Set<String> set) {
		System.out.println("\n\nupdated set after adding element: ");
		set.forEach(d->{System.out.println(d);});
	}
	public void displaytreeoperation(TreeSet<String> treeset) {
		System.out.println("\n\nreverse treeset is: "+treeset);
		System.out.println("pollfirst is: "+((TreeSet<String>) treeset).pollFirst());
		System.out.println("pollast is: "+treeset.pollLast());
		System.out.println("updated treeset is:"+treeset); //using pollfirst and polllast the largest and smallest value is retreived and removed 
        System.out.println("headset treeset is:"+treeset.headSet("ramesh")); //it take element upto ramesh excluding the ramesh
        System.out.println("headset with boolean value: "+treeset.headSet("ramesh", true)); //here true means include the element and false mean exclude the element
        System.out.println("subset in treeset: "+treeset.subSet("set element added",false,"rajat",true));
	    System.out .println("tailset in treeset: "+treeset.tailSet("set element added", false));//it will give element upto 'set element added' after excluding it as false vlaue is used 
	   
	}
	public void displayqueue(Queue<String> qu,Deque<String> du) {
		System.out.println("after removing the element from the queue: ");
		qu.remove();
		qu.poll();
		System.out.println(qu);
		System.out.println("\nDeque:\n "+du);
		du.pollLast();
		du.pollFirst();
		System.out.println("\nDeque after updation:\n "+du);
	}
	
}


class LinkedLIST extends MainArray{
	public List<String> reverse(List<String> re) {
	//	System.out.println("\n\nafter reversing: ");
		/*Iterator<String> i=((LinkedList<String>) re).descendingIterator();
		while(i.hasNext()) {
			System.out.print(" "+i); // one way reversing the list using iterator descending function where we have to add the cast to the iterator
		}*/
		Collections.reverse(re);
		return re;	
	}
}

class Treesets extends MainArray{

	public void treeset(Set<String> sets) {
		SortedSet<String> s=new TreeSet<String>(sets);
		s.add("value added to treeset");
		operation(s);
		
	}
	public void operation(Set<String> op) {
		TreeSet<String> t=(TreeSet<String>) ((TreeSet<String>) op).descendingSet();
		Displays d=new Displays();
		d.displaytreeoperation(t); 
	}
}

class QueueDeque extends SetFunctionality{
	public void queue(Set<String> q) {
	Queue<String> qu=new PriorityQueue<String>(q);
	qu.add("queue added");	
	Deque<String> du=new ArrayDeque<String>(qu);
	queoperation(qu,du);
	
	}
	public void queoperation(Queue<String> qu,Deque<String> du) {
		System.out.println("head of queue: "+qu.element());
		System.out.println("peek of the queue: "+qu.peek());
		Displays d=new Displays();
		du.offer("deque");
		du.offerFirst("first deque");
		du.offerLast("last deque");
		d.displayqueue(qu,du);
		
		
	}
}

class SetFunctionality extends MainArray{ 
	public void addtoset(ArrayFunctionality s1,ArrayFunctionality s2,ArrayFunctionality s3, ArrayFunctionality s4,List<String> re) {
		Set<ArrayFunctionality> s=new HashSet<ArrayFunctionality>(); //created a set of type array functionality
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		System.out.println("\n\nprinting the set functionality");
		s.forEach(a->{System.out.println("name-> "+a.name+" gender-> "+a.gender+" age-> "+a.age+" salary-> "+a.salary);});
		Set<String> set=new HashSet<String>(re); //created set and adding element from list of string //typeconversion from other collection 
		set.add("set elment added");// set element added along with the array element
		set.add("ramesh");//indexing is not possible as it is unordered set of element
		set.add("rajat");
		Displays d=new Displays();
		d.displayset(set);
		Treesets t=new Treesets();
		t.treeset(set);
		QueueDeque q=new QueueDeque();
		q.queue(set);
		Mapping m=new Mapping();
		m.mapoperation();
		
	}
}


class Mapping{
	public void mapoperation() {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(2,"string 1");
		m.put(30, "string 3");
		m.put(10,"string 4");
		m.put(1,"string 6"); //added element into the map using put method which take key and value
		//using for each loop
		
		for(Entry<Integer, String> a:m.entrySet()) { //Entry is subinterface of Map because map cannot be traversed
			//therefore two way of defining the same thing
			/* for(Map.Entry<Integer,String> a:m.entrySet()) */
			System.out.println("keys: "+a.getKey()+"  values: "+a.getValue());
			
			
		}
		System.out.println();
		m.replace(1, "string 9"); //replacing the value of 1 key from string 6 to string 9
		//using the forEach method same line of code can be done in single line
		m.forEach((k,v)->{System.out.println("Keys: "+k+"  values: "+v);System.out.println();});
		
		comparision(m);
		hashmap(m);
		

	}

	public void comparision(Map<Integer, String> m) {
		//converting the map into set so that it can be traversed
		//stream method will return a stream with a collection of data
		//sorting the data according to the comparator 
		//then using for each method to perform the printing action on the element present in the stream
		System.out.println("\ncomparing by keys: ");
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("\ncomparing by keys in descending order: ");
		m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		System.out.println("\ncomparing by values: ");
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("\ncomparing by values in descending order: ");
		m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		
	}
	public void hashmap(Map<Integer,String> m) {
		System.out.println("\n\niterating hashmap: ");
		m.forEach((k,v)->System.out.println("keys: "+k+" values: "+v));
		System.out.println("\n\nadding the duplicate key values: ");
		m.put(2,"string 2");
		m.put(30,"string 30");
		m.forEach((k,v)->System.out.println("keys: "+k+" values: "+v));
		System.out.println("\n\nchecking whether the element is present in hashmap if not then add: ");
		m.putIfAbsent(11,"string 10"); //it will check whether the particular key is present in the map
		m.forEach((k,v)->{System.out.println("keys: "+k+" values: "+v);});
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(101,"String 101");
		m1.put(99,"string 91");
		System.out.println("\n\nnew hashmap: ");
		m1.forEach((k,v)->System.out.println("keys: "+k+" values: "+v));
		System.out.println("\n\nafter putting the another hashmap inside exiting map: \n");
		m.putAll(m1);
		m.forEach((k,v)->{System.out.println("keys: "+k+" values: "+v);});
		System.out.println("\n\nafter sorting: ");
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("\n\nreverse after sorting: ");
		m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		linkhashmap(m);
	}
	public void linkhashmap(Map<Integer,String> m) {
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>(m);
		m1.put(121,"string 21");
		System.out.println("\n\ntraversing the linkedhashmap: \n"+m1.entrySet());
		System.out.println("\n\nkeys: "+m1.keySet());
		System.out.println("\n\nvalues:"+m1.values());
		System.out.println("\n\n");
		treemap(m1);
		hashtable(m1);
		
	}
	public void hashtable(Map<Integer,String> m) {
	
		Map<Integer,String> m1=new Hashtable<Integer,String>(m);
		//using the hashtable class from map interface
		//Hashtable<Integer,String> m1=new Hashtable<Integer,String>(m);
		m1.put(21, "string 21");
		System.out.println("\n\nhashtable after traversing: ");
		m1.forEach((k,v)->{System.out.println("keys: "+k+" values: "+v);});
		System.out.println("\n\nafter removing: ");
		m1.remove(101);
		m1.forEach((k,v)->{System.out.println("keys: "+k+" values: "+v);});
		System.out.println("\n\nusing getOrDefault: "+m1.getOrDefault(21, "not found in the hashtable"));
		System.out.println("\n\nusing getOrDefault: "+m1.getOrDefault(233, "not found in the hashtable"));
		m1.putIfAbsent(233, "now found in the hashtable");
		System.out.println("\n\nusing putifabsent: "+m1.entrySet());
		System.out.println("\n\nsorting hashtable according to keys: ");
		m1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	    
	}
	
	
	public void treemap(Map<Integer,String> m) {
		SortedMap<Integer,String> m1=new TreeMap<Integer,String>(m);
		//Map<Integer,String> m1=new TreeMap<Integer,String>(m);
		//treemap is a class under sortedmap interface which is the subinterface of map interface
		//sortedmap and navigable map is the subinterface of map interface 
		m1.put(31, null);
		System.out.println("\n\ntreemap after traversing: ");
		m1.forEach((k,v)->{System.out.println("keys: "+k+" values: "+v);});
		System.out.println("\n\nafter removing: ");
		m1.remove(30);
		
		m1.forEach((k,v)->{System.out.println("keys: "+k+" values: "+v);});
		System.out.println("\n\ndescendingMap: "+((TreeMap<Integer, String>) m1).descendingMap());  
		//same line can be written by creating the object of navigable interface by which we need not to add the cast while declaring
		NavigableMap<Integer,String> n=new TreeMap<Integer,String>(m1);
		//here navigable map is the subinterface of map interface in which we are using the tree map class so that we can use some functionality 
		//of navigable interface without typecasting
		System.out.println("\n\ndescendingMap: "+n.descendingMap()); 
		System.out.println("\n\nheadMap: "+n.headMap(99,true));
		System.out.println("\n\ntailMap: "+n.headMap(31,true));
		System.out.println("\n\nsubMap: "+n.subMap(2,false,101,true));
		System.out.println("\n\nsorting treemap according to keys: ");
		n.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("\n\nsorting treemap according to values: in reverse ");
		n.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		
		
	}
	
	public void  linkedhashfunctionality (ArrayFunctionality s1,ArrayFunctionality s2,ArrayFunctionality s3, ArrayFunctionality s4) {
		Map<Integer,ArrayFunctionality> m=new LinkedHashMap<Integer,ArrayFunctionality>();
		m.put(11, s1);
		m.put(3, s2);
		m.put(32, s4);
		m.put(21, s3);
		System.out.println("\n\nArrayfunctionality pass as value inside linkedhashmap: ");
		m.forEach((k,v)->{System.out.println("Keys: "+k+"   names: "+v.name+"   geneder: "+v.gender+"   age: "+v.age+"   salary: "+v.salary);});
		
	}
		
}

class Enumoperation{
	public enum key{ //return type is enum
		one,two,three,four;
	}
	public void operation(ArrayFunctionality s1,ArrayFunctionality s2,ArrayFunctionality s3, ArrayFunctionality s4) {
		EnumMap<key,ArrayFunctionality> e= new EnumMap<key,ArrayFunctionality>(key.class);
		e.put(key.one, s1);
		e.put(key.two, s3);
		e.put(key.four, s4);
		e.put(key.three, s2);
		System.out.println("\n\nenum data with key and values: ");
		
		e.forEach((k,v)->{System.out.println("Keys: "+k+" names: "+v.name+" gender: "+v.gender+" age: "+v.age+" salary: "+v.salary);});
		
	}
}
class CollectionOperation{
	public void operation(List<String> s) {
		Collections.addAll(s,"collect 1", "collect 2","collect 3"); //it means to add the string inside list of string
		System.out.println("\n\n");
		s.forEach(a->{System.out.println("collection data: "+a);});
		System.out.println("\n\nmaximum value inside the collection: "+Collections.max(s));
		System.out.println("\n\nminimum value inside the collection: "+Collections.min(s));
		Collections.reverse(s);
		System.out.println("\n\nreverse of collection data: "+s);
		
	}
}

class MainArray{
	public static void main(String args[]) {
		ArrayFunctionality arr=new ArrayFunctionality("shrey","male",23,37500);
		ArrayFunctionality arr1=new ArrayFunctionality("shreyansh tyagi","male",24,67500);
		ArrayFunctionality ar2=new ArrayFunctionality("shivani","female",25,30000);
		ArrayFunctionality arr3=new ArrayFunctionality("shalu","female",23,39000);
		List<ArrayFunctionality> l=addtolist(arr,arr1,ar2,arr3);
		
		System.out.println("printing the array functionality");
		l.forEach(a->{System.out.println("name-> "+a.name+" gender-> "+a.gender+" age-> "+a.age+" salary-> "+a.salary);});
		List<String> lis2=addelement();
		System.out.println("let see the element of list 2: "+lis2);
		List<String> lis3=retainelement(lis2);
		System.out.println("after retaining the element: "+lis3);
		serialization(l);
		
		Displays d=new Displays();
		LinkedLIST linklist=new LinkedLIST();
		List<String> linkedlist=linkedlist(lis2);
		d.displaylist(linkedlist);
		
		
		
		List<String> linkedre=linkedremove(linkedlist);
		d.displayremove(linkedre);
		
		
		List<String> re=linklist.reverse(linkedre);
		d.displayreverse(re);
		
		SetFunctionality s=new SetFunctionality();
		s.addtoset(arr,arr1,ar2,arr3,re);
		
		Mapping m=new Mapping();
		m.linkedhashfunctionality(arr,arr1,ar2,arr3);
		
		Enumoperation e=new Enumoperation();
		e.operation(arr,arr1,ar2,arr3);
		
		CollectionOperation c=new CollectionOperation();
		c.operation(linkedlist);
		
	}
	

	public static List<String> linkedremove(List<String> re){
		re.remove(0);
		((LinkedList<String>) re).removeFirst();
		((LinkedList<String>) re).removeLast();
		((LinkedList<String>) re).removeFirstOccurrence("shiva");
		((LinkedList<String>) re).removeLastOccurrence("hello");
		return re;
	}
	public static List<String> linkedlist(List<String> lis2){
		LinkedList<String> l=new LinkedList<String>();
		l.addAll(lis2);
		l.add(0,"matt added into linked list");
		((LinkedList<String>) l).addFirst("firstly");
		((LinkedList<String>) l).addLast("lastly");
		l.addFirst("abc");
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("shrey");
		l1.add("hello");
		l.addAll(1, l1); 
		return l;
	}
	public static void serialization(List<ArrayFunctionality> l) {
		try {
			//serialization
			FileOutputStream f=new FileOutputStream("file"); //creating the output stream
			ObjectOutputStream o=new ObjectOutputStream(f); //creating the object of output stream
			o.writeObject(l); //writing the data inside the file
			f.close();
			o.close();
			//deserialization
			FileInputStream i=new FileInputStream("file"); //creating the input stream
			ObjectInputStream o1=new ObjectInputStream(i); //creating the object of input stream
			ArrayFunctionality a=(ArrayFunctionality)o1.readObject(); //as the data is of type arrayfunctionality type therefore creating the variable of same type
			System.out.println(a);
			o1.close();
			i.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static List<ArrayFunctionality> addtolist(ArrayFunctionality arr,ArrayFunctionality arr1,ArrayFunctionality ar2,ArrayFunctionality arr3){
		List<ArrayFunctionality> l=new ArrayList<ArrayFunctionality>();
		l.add(arr);
		l.add(arr1);
		l.add(ar2);
		l.add(arr3);
		return l;
	}
	public static List<String> addelement(){
		List<String> l1=new ArrayList<String>();
		l1.add("ravi");
		l1.add("sonu");
		System.out.println("l2 list now: "+l1);
		l1.add(1, "shrey at index 1");
		List<String> l2=new ArrayList<String>();
		l2.add("shiva");
		l2.add(1,"shalu");
		l1.addAll(l2); //added whole l2 list inside l1
		l1.addAll(0,l2); //added whole l2 list inside l1 at index 0
		System.out.println("updatded list is: "+l1);
		List<String> lis1=removeelement(l1,l2);
		System.out.println("is the list is empty: "+lis1.isEmpty());
		return l2;
		
	   
		
	}
	public static List<String> removeelement(List<String> l1,List<String> l2){
		l1.remove("ravi");
		l1.remove(0);
		l1.add(0,"shanu");
		l1.removeAll(l2);
		System.out.println("list after the element has been removed: "+l1);
		l1.removeIf(str->str.contains("shiva"));
		System.out.println("updated list after removing the element: "+l1);
		l1.clear();
		System.out.println("after clearing the list is: "+l1);
		return l1;
		
		
	}
	public static List<String> retainelement(List<String> l2){
		List<String> l3=new ArrayList<String>();
		l3.add("shalu");
		l3.add("ravi");
		l2.retainAll(l3);
		l2.forEach(a->{System.out.println(a);});
		return l2;
		
	}
}



