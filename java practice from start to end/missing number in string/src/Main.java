import java.util.*;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args) {
        	String a="99101102";
        	List<String> list=new ArrayList<String>();
        	for(int i=0;i<=9;i++){
        	    list.add(Integer.toString(i));
        	}
        List<String>  s1= Arrays.asList(a.split("")).stream().distinct().collect(Collectors.toList());
        for(int i=0;i<s1.size();i++){
            if(list.contains(s1.get(i))){
                list.remove(s1.get(i));
            }
        }
        for(String l : list){
            System.out.print(l+" ");
        }
	}
}
