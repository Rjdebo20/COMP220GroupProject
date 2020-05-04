
public class Warrior extends Classes{
	private int hitPoints;
	private int defense;
	private int damage;
	private int sDamage;
	
	/**
	 * constructor for the warrior
	 * @param hitPoints - the Warrior's hitpoints
	 * @param defense - the Warrior's defense
	 * 
	 */
	public Warrior(int hitPoints, int defense, int damage, int sDamage) {
		this.hitPoints = hitPoints;
		this.sDamage = sDamage;
		this.damage = damage;
		this.defense = defense;
		
		}
	
	public void setDamage() {
		damage += 50;
	}
	
	/**
	 * The warrior's setDamage method will set the warriors damage in between a range
	 * that we choose.
	 */
	public int getDamage() {
		return damage;
	}

	public void setHitpoints() {
		hitPoints = 500;
	}
	
	
	/**
	 * returns the warrior's hitPoints
	 * @return
	 */
	public int getHitpoints() {
		return hitPoints;
	}
	
	/**
	 * Sets the warriors special attack damage
	 */
	public int specialAttack() {
		sDamage = 100;
		return sDamage;
	}
	public int attack() {
		return damage;
	}
	
	public void setsDamage() {
		sDamage = 100;
	}
	public int getsDamage() {
		return sDamage;
	}
	public void setArmor() {
		defense = 200;
	}
	
	public int getArmor() {
		return defense;
	}
	
}

