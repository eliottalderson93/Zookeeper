
public class Mammal {
	public Integer energyLevel;
	public Mammal() {
		this.energyLevel = 100;
	}
	public Integer displayEnergy() {
		System.out.print("Energy Level: ");
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}
