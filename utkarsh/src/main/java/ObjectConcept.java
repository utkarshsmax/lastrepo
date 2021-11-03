
class Animal{
	
	void Bark()
	{
		System.out.println("Animal can Move but not Bark");
	}
}

class Dog extends Animal
{
	@Override
	protected void Bark() {
		System.out.println("Dogs can Bark");
	}
}

public class ObjectConcept {

	public static void main(String[] args) {
		
		Animal a=new Dog();
		a.Bark();
		

	}

}
