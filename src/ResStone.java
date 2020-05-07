
public class ResStone extends Item{
	private int revive;
	public void effect(Classes warrior) {
		if (warrior.getHitpoints() <= 0) {
			revive = warrior.getHitpoints() + 10;
			warrior.setHitpoints(revive);
			System.out.println("You have revived yourself!");
			
			warrior.inventory.remove(warrior.itemIndex);
		}
		else if((warrior.getHitpoints() > 1) && (warrior.getHitpoints() <= 10)) {
			System.out.println("You are still alive!");
			revive = warrior.getHitpoints();
			warrior.setHitpoints(revive);
		}
	}
	public String getName() {
		return "Resurrection Stone";
	}
}
