
public class DefensePotion extends Item{
	private int defense;
	
	public void effect(Classes warrior) {
		if (warrior.getArmor() == 2) {
			System.out.println("Your defense is intact!");
			defense = warrior.getArmor();
			warrior.setArmor(defense);
		}
		else if(warrior.getArmor() == 1) {
			warrior.inventory.remove(warrior.itemIndex);
			defense = warrior.getArmor() + 1;
			warrior.setArmor(defense);
		}
		else if(warrior.getArmor() == 0) {
			warrior.inventory.remove(warrior.itemIndex);
			defense = warrior.getArmor() + 2;
			warrior.setArmor(defense);
		}
	}
	public String getName() {
		return "Defense Potion";
	}
}
