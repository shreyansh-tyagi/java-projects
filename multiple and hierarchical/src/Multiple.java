import java.util.*;
public class Multiple {
	int addition;
	Multiple(int addition)
	{
	this.addition=addition+10;
	}
}
class InheritMultiple extends Multiple{ //single inheritence
	int substraction;
	InheritMultiple(int addition,int substraction){
		super(addition+10);
		this.substraction=addition-5;
	}
}
class InheritInheritMultiple extends InheritMultiple{ //multi level inheritence
	int multi;
	InheritInheritMultiple(int addition,int substraction,int multi){
		super(addition,substraction);
		this.multi=substraction*10;
	}
}
class Inheritbefore extends InheritInheritMultiple{ //hierarchical inheritence
	float division;
	Inheritbefore(int addition,int substraction,int multi,float division){
		super(addition,substraction,multi);
		this.division=multi/addition;
	}
}
class Main1{
	public static void main(String args[]) {
		
	}
}