
public class ResStone extends Item{
	public int effect(Classes thisClass) {
		if (thisClass.hitPoints == 0) {
			System.out.println("You have revived yourself!");
			thisClass.inventory.remove(thisClass.itemIndex);
		}
		else if((thisClass.hitPoints > 1) && (thisClass.hitPoints <= 10)) {
			System.out.println("You are still alive!");
			return thisClass.hitPoints;
		}
			return thisClass.hitPoints + 10;
	}
}
