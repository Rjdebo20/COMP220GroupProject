
public class HealthPotion extends Item{
	private int hp;
	public void effect(Classes warrior) {
		if (warrior.getHitpoints() == 10) {
			System.out.println("You are already at max hp!");
			hp = warrior.getHitpoints();
			warrior.setHitpoints(hp);
		}
		else if (warrior.getHitpoints() == 8) {
			warrior.inventory.remove(warrior.itemIndex);
			hp =  warrior.getHitpoints() + 2;
			warrior.setHitpoints(hp);
			
		}
		else if (warrior.getHitpoints() == 9) {
			warrior.inventory.remove(warrior.itemIndex);
			hp =  warrior.getHitpoints() + 1;
			warrior.setHitpoints(hp);
		}
		else if((warrior.getHitpoints() > 0) && (warrior.getHitpoints() < 8)) {
			warrior.inventory.remove(warrior.itemIndex);
			hp = warrior.getHitpoints() + 3;
			warrior.setHitpoints(hp);

		}
		
	}
	public String getName() {
		return "Health Potion";
	}
}
