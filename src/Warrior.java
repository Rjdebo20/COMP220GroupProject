import java.util.ArrayList;

public class Warrior extends Classes {
	protected int hitPoints;
	private int defense;
	private int damage;
	private int sDamage; 

	public Warrior(int hitPoints, int defense, int damage, int sDamage) {
		this.hitPoints = hitPoints;
		this.sDamage = sDamage;
		this.damage = damage;
		this.defense = defense;
		inventory = new ArrayList<Item>();
		ResStone res = new ResStone();
		HealthPotion hp = new HealthPotion();
		DefensePotion dp = new DefensePotion();
		inventory.add(res);
		inventory.add(hp);
		inventory.add(dp);
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getDamage() {
		return damage;
	}

	public void setHitpoints(int hitpoints) {
		this.hitPoints = hitpoints;
	}
	public int getHitpoints() {
		return hitPoints;
	}

	
	public void setsDamage(int sDamage) {
		this.sDamage = sDamage;
	}
	public int getsDamage() {
		return sDamage;
	}

	public void setArmor(int armor) {
		this.defense = armor;
	}
	public int getArmor() {
		return defense;
	}

}
