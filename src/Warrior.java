public class Warrior extends Classes {
	private int hitPoints;
	private int defense;
	private int damage;
	private int sDamage;

	public Warrior(int hitPoints, int defense, int damage, int sDamage) {
		this.hitPoints = hitPoints;
		this.sDamage = sDamage;
		this.damage = damage;
		this.defense = defense;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getDamage() {
		return damage;
	}

//
	public void setHitpoints(int hitpoints) {
		this.hitPoints = hitpoints;
	}
	public int getHitpoints() {
		return hitPoints;
	}

	// special damage
	public void setsDamage(int sDamage) {
		this.sDamage = sDamage;
	}
	public int getsDamage() {
		return sDamage;
	}

	//armor
	public void setArmor(int armor) {
		this.defense = armor;
	}
	public int getArmor() {
		return defense;
	}

}
