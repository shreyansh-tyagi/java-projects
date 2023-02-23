
public class ReverseString {

	public static void main(String[] args) {
		String a ="time to write great code";
		//a2b2c3ad
		
		String b= transformString(a);
		System.out.print(b);

}
	public static String transformString(String a) {
		int count=0;
		String b="";
		char ch[] = new char[a.length()];
		for(int i=0;i<a.length()-1;i++) {
			ch[i]=a.charAt(i);
		}
		return b;
		
	}
}

