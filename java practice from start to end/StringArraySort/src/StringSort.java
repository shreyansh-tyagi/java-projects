//["123","5","99","845","11"]
// 1+3=4, 5, 9, 8+5=13, 1 -> 4,5,9,13,1 -> sort its corespoding value in asc or dsc ["11","123","5","99","845"] 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class StringSort {
	public static void main(String args[]) {
		String s[]= {"123","5","99","845","11"};
		HashMap<String, Integer> h=new HashMap<>();
		List<Integer> l=new ArrayList<>();
		String a="";
		int b=0;
		for(int i=0;i<s.length;i++) {
			a=s[i];
			for(int j=0;j<a.length();j+=2) {
				b+=Integer.parseInt(String.valueOf(a.charAt(j)));
			}
			l.add(b);
			h.put(a, b); //unordered form
			b=0;
		}
		// using hashmap (key and value concept -> sorting based on values)
		System.out.println(h);
		Map<String, Integer> sortedMap = 
			     h.entrySet().stream()
			    .sorted(Entry.comparingByValue())
			    .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
			                              (e1, e2) -> e1, LinkedHashMap::new));
		
		List<Entry<String, Integer>> sortedList = h.entrySet().stream()
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toList());
		
		
		System.out.println(sortedMap.keySet().toString());
		System.out.println(sortedList.toString());
		
		
		// without hashmap using list manipulation
		System.out.println("the list is: "+l);
		Collections.sort(l);
		System.out.println("the list is: "+l);
		for(int k=0;k<s.length;k++) {
			
		}
		
	}
}
