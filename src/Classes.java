import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Classes {
	protected int hitPoints;
	protected int defense;
	private Random randGen;
	protected ArrayList<Item> inventory;
	protected int itemIndex;

	/**
	 * the block method will use the randGen to create a random opportunity for either
	 * the hero or the enemy to block the incoming attack
	 *
	 */
	public boolean block() {
		randGen = new Random();
		int block = randGen.nextInt((3)) + 1;
		if (block == 1) {
			return true;
		}
		return false;
	}
	
	/**
	 * setDamage is an abstract method. This means that all the child classes will
	 * implement this method, but in different ways. For example, the warrior class
	 * will do more damage than the healer class.
	 */
	public abstract void setDamage(int damage);
	
	/**
	 * setHitpoints is also an abstract class because each class will have a different
	 * amount of hitpoints.
	 */
		
	public abstract void setHitpoints(int hitPoints);
	
	/**
	 * addItem will add an item to the hero's inventory if the hero chooses to do so
	 * @param item - the item being added.
	 */
	public void addItem(Item item) {
		if (inventory.size() <= 9) {
			this.inventory.add(item);
			System.out.println(item.getName() + " was added to your inventory.");
			int counter = 0;
			for(int i = 0;i < inventory.size(); i++) {
				counter++;
			}
			int slots = 10 - counter;
			System.out.println("You have " + slots + " slots left in your inventory.");
		}
		else if (inventory.size() == 10){
			System.out.println("Your inventory is full!");
		}
		
}
	
	
	public String inventory() {
		StringBuilder sb = new StringBuilder();
		if (inventory.size() > 0) {
		for (int i = 0; i < inventory.size(); i++) {
			sb.append((i+1) + ". " + inventory.get(i).getName());
			sb.append("\n");
		}
		}
		else if(inventory.size() == 0) {
			return "Your inventory is empty!";
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
	public Item getItem() {
		Scanner in = new Scanner(System.in);
		System.out.println("What item..");
		System.out.println(this.inventory());
		int i = 0;
		i = in.nextInt();
		itemIndex = i - 1;
		return this.inventory.get(itemIndex);
	}
	public void useItem(Item item) {
		item.effect(this);
	}
	
	public abstract int getArmor();
	
	public abstract int getHitpoints();
	
	public abstract void setArmor(int armor);
		
}


