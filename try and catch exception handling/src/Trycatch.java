import java.util.*;
public class Trycatch {
	int i,j;
	Trycatch(int i,int j){
		this.i=i;
		this.j=j;
	}

}
class Trycatch1 extends Trycatch{
	Trycatch1(int i,int j){
		super(i,j);
	}
	int data;
	void trycatchmethod() {
	try {
	 data = i/j;
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("the division is: "+i/(j+2));
		
	}
	}
}
class Maintry{
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Trycatch1 t=new Trycatch1(sc.nextInt(),sc.nextInt());
		t.trycatchmethod();
		sc.close();
	}
}
