public class Demon extends Classes {
	private int hitPoints;
	private int defense;
	private int damage;
	private int sDamage;
	/**
	 * 
	 * @param hitPoints - Demon's hitpoints
	 * @param defense
	 * @param damage
	 * @param sDamage
	 */
	public Demon(int hitPoints, int defense, int damage, int sDamage) {
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

	//set hitpoints
	public void setHitpoints(int hitpoints) {
		this.hitPoints = hitpoints;
	}
	//get hitpoints
	public int getHitpoints() {
		return hitPoints;
	}
	public int getArmor() {
		return defense;
	}
	public void setArmor(int armor) {
		this.defense = armor;
	}



}
