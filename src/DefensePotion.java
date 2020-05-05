
public class DefensePotion extends Item{
	public int effect(Classes thisClass) {
		if (thisClass.defense == 2) {
			System.out.println("Your defense is intact!");
			return thisClass.defense;
		}
		else if(thisClass.defense == 1) {
			thisClass.inventory.remove(thisClass.itemIndex);
			return thisClass.defense + 1;
		}
		else if(thisClass.defense == 2) {
			thisClass.inventory.remove(thisClass.itemIndex);
	}
		return thisClass.defense + 2;
	}
}
