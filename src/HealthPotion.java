
public class HealthPotion extends Item{
	public int effect(Classes thisClass) {
		if (thisClass.hitPoints == 10) {
			System.out.println("You are already at max hp!");
			return thisClass.hitPoints;
		}
		else if (thisClass.hitPoints == 8) {
			thisClass.inventory.remove(thisClass.itemIndex);
			return thisClass.hitPoints + 2;
			
		}
		else if (thisClass.hitPoints == 9) {
			thisClass.inventory.remove(thisClass.itemIndex);
			return thisClass.hitPoints + 1;
		}
		else if((thisClass.hitPoints > 0) && (thisClass.hitPoints < 8)) {
			thisClass.inventory.remove(thisClass.itemIndex);

		}
		return thisClass.hitPoints + 3;
	}
}
