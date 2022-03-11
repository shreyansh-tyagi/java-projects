package covariant;
import java.util.*;
public class Covariant {

	Covariant method() {
		return this;
	}
	void print() {
		System.out.println("we are in parent class of covariant");
	}
}
class Covariant1 extends Covariant{
	Covariant method() {
		return this;
	}
	void print() {
		System.out.println("we are in subclass of covariant1");
	}
	
}
class Covariant2 extends Covariant1{
	Covariant method() {
		return this;
	}
	void print() {
		System.out.println("we are in subclass of covariant2");
	}
}