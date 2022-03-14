
abstract class Abstraction {
	abstract void draw();

}
class rectangle extends Abstraction {
	void draw() {
		System.out.println("drawing rectangle ");
	}
}
class circle extends Abstraction{  //multi inheritence
	void draw() { //method overiding
		System.out.println("drawing circle");
	}
}
class square extends Abstraction{
	void draw() {
		System.out.println("drawing sqaure");
	}
}
class Maindraw {
	public static void main(String args[]) {
		Abstraction a=new rectangle(); //dynamic polymorphism //creating object of abstract class and invoking the method of another class
		a.draw(); 
		Abstraction b=new circle();
		b.draw();
		Abstraction c;
		c=new rectangle();
		c.draw();
		c=new circle();
		c.draw();
		c=new square();
		c.draw();
		
		
		
	}
}