public class Bat extends Mammal{
	public Bat() {
		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("The giant bat silently releases its hold on the tree and flits off into the dusky night.");
		this.energyLevel = this.energyLevel - 50;
		this.displayEnergy();
	}
	public void drinkHuman() {
		System.out.println("A scream of terror echoes through your surroundings as you watch a large shadowy figure suddenly descend on the faint outline of a person in the dim evening.");
		this.energyLevel = this.energyLevel + 25;
		this.displayEnergy();
	}
	public void attackTown() {
		System.out.println("A wave of panic sweeps through the town as a giant bat looms over the thatch rooftops, searching for victims to it's primal thirst.");
		this.energyLevel = this.energyLevel - 100;
		this.displayEnergy();
	}
}
