import java.util.ArrayList;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l= new ArrayList<>();
		l.add(21);
		l.add(32);
		l.add(42);
		l.add(31);
		l.add(98);
		//int count;
		l.stream().forEach(a->{
			
			  if(a%2!=0) 
				  System.out.println(a);
		});
		//System.out.println(l);
		

	}

}
