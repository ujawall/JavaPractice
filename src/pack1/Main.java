package pack1;

class tesr {
	public tesr() {
		System.out.println("in constructor");
	}
	
	{
		System.out.println("in instance block");
	}
}

public class Main {
	public static void main(String args[]){
//		Animal a=new Dog();
//		Dog g=new Dog();
//		a.special_ability();
//		g.special_ability();
		
//		Elephant e=new Elephant();
//		Elephant e2=(Elephant)e.Clone()
//		ExceptionHandlingpct p=new ExceptionHandlingpct();
//		p.Area2();
		MultipleCatchBlocks mb=new MultipleCatchBlocks();
		mb.multiplecatch();
	}
}
