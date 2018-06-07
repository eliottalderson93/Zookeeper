public class Gorilla extends Mammal {
	public void throwBanana() {
		System.out.println("The Gorilla has thrown a Banana.");
		this.energyLevel = this.energyLevel -5;
		this.displayEnergy();
	}
	public void eatBanana() {
		System.out.println("The Gorilla looks hardier after eating a banana.");
		this.energyLevel = this.energyLevel +10;
		this.displayEnergy();
	}
	public void climb() {
		System.out.println("The Gorilla scales a nearby tree with nimble ease.");
		this.energyLevel = this.energyLevel -10;
		this.displayEnergy();
	}
}
