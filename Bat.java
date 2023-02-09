
public class Bat extends Mammal {
//	energy starts at 300, overriding the default from Mammal class
	public Bat() {
		energyLevel = 300;
	}
	
//	fly: print the sound of a bat taking off; decrease energy by 50
	public void fly() {
		System.out.println("Flap flap flap! Bat flew off.");
		setEnergyLevel(-50);
	}
//	eat humans: energy +25
	public void eatHumans() {
		System.out.println("...wow, the Bat just ate a person. That was grotesque.");
		setEnergyLevel(25);
	}
//	attack town: print the sound of a town on fire; -100
	public void attackTown() {
		System.out.println("Crackle crackle scream! The Bat just set a town on fire. Why do we let it leave its enclosure again...?");
		setEnergyLevel(-100);
	}

}
