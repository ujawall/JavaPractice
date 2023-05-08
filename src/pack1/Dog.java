package pack1;

public class Dog extends Animal {
	Dog(){
		System.out.println("This is the dog class constructor");
		
	}
	public String specialAbility() {
		System.out.println("Dog barks");
		return "Covariant return types trial";
	}
}
