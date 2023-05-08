package pack1;

class Animal {
	Animal(){
		System.out.println("This is the animal class constructor");
	}
	final public Object special_ability() {
		System.out.println("Different animals different voices");
		return "Covariant parent";
	}

}
class Frog extends Animal{
	Frog(){
		System.out.println("This is the frog class constructor");
	}
}
class Elephant extends Frog{
	Elephant(){
		System.out.println("This is the elephant class constructor");
	}
}
