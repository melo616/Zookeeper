
public class Gorilla extends Mammal {


	public void testFunction() {
		System.out.println("Heyyyyy");
		
	}
	
//	throw something: prints a message indicating that the gorilla has thrown something; decrease energy by 5
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		setEnergyLevel(-5);
	}
	
//	eat bananas: print a message indicating gorilla is satisfied; increase energy by 10
	public void eatBananas() {
		System.out.println("Nom nom nom! The gorilla ate bananas and they were delicious.");
		setEnergyLevel(10);
	}
//	climb: print message indicating gorilla has climbed a tree; energy -10
	public void climb() {
		System.out.println("The gorilla climbed a tree!");
		setEnergyLevel(10);
	}
}
