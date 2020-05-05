public class Demon extends Classes {
	private int hitPoints;
	private int defense;
	private int damage;
	private int sDamage;
	/**
	 * constructor
	 * 
	 * @param hitPoints - the demon's hitpoints
	 * 
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
	public int getDamge() {
		return damage;
	}

	//set hitpoints
	public void setHitpoints(int hitpoints) {
		this.hitPoints = hitpoints;
	}
	//get hitpoints
	public int getHitPoints() {
		return hitPoints;
	}


	/**
	 * Sets the warriors special attack damage
	 */

	public void specialAttackDamage() {

	}


}
