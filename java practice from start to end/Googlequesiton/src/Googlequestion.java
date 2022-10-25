import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Googlequestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashMap<String,List<String>> map=new HashMap<String,List<String>>(){{
	    	put("2",new ArrayList<String>());
	    	map.get("2").add("a");
	    	put("3","def");
	    	put("4","ghi");
	        put("5","jkl");
	    	put("6","mno");
	    	put("7","pqrs");
	    	put("8","tuv");	
	    	put("9","wxyz");
	    }};
	    String s=" ",a=" ";
	    List<String> s1 = Arrays. asList("twlo", "code", "htch");
	    List<String> s2 = Arrays. asList("+17474824380", "+14157088956", "+919810155555", "+15109926333", "+1415123456");
	    for(int i=0;i<s1.size();i++) {
	    	s=s1.get(i);
	    	for(int j=0;j<s.length();j++) {
	    		//System.out.println(Character.toString(s.charAt(j)));
	    			for(Entry<String, String> entry: map.entrySet()) {
	    				System.out.println(entry);
	    			      if(entry.getValue()==Character.toString(s.charAt(j))) {
	    			        a+=entry.getKey();
	    			        System.out.println(a);
	    		}
	    	}
	    }
	    
	    
	    

	}
	}
}
