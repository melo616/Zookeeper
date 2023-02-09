
public class Mammal {
	protected int energyLevel = 100;
	
//	getter
	public int getEnergyLevel() {
		return energyLevel;
	}
	
//	setter
	public void setEnergyLevel(int energyChange) {
		energyLevel += energyChange;
	}
	
//	displayEnergy function to show the animal's energy level as well as return it
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}
