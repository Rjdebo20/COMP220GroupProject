import java.util.ArrayList;
import java.util.Random;

public abstract class Classes {
	private int hitPoints;
	private int defense;
	private Random randGen;
	private ArrayList<String> inventory;

	/**
	 * the block method will use the randGen to create a random opportunity for either
	 * the hero or the enemy to block the incoming attack
	 *
	 */
	public void block() {
		
	}
	
	/**
	 * setDamage is an abstract method. This means that all the child classes will
	 * implement this method, but in different ways. For example, the warrior class
	 * will do more damage than the healer class.
	 */
	public abstract void setDamage();
	
	/**
	 * setHitpoints is also an abstract class because each class will have a different
	 * amount of hitpoints.
	 */
		
	public abstract void setHitpoints();
	
	/**
	 * addItem will add an item to the hero's inventory if the hero chooses to do so
	 * @param item - the item being added.
	 */
	public void addItem(String item) {
		
	}
	
	public String inventory() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= inventory.size(); i++) {
			sb.append(i + ". " + inventory.get(i));
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public int takeDamage(int dDealt) {
		hitPoints -= dDealt;
		return hitPoints;
	}
	
	/**
	 * This method will check if the hero or enemy is dead
	 */
	public boolean isDead() {
		if (hitPoints == 0) {
			return true;
		}
		return false;
	}
}

