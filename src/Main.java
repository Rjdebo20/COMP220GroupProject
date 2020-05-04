
public class Main {

	public static void main(String[] args) {
		int defense = 0;
		int damage = 0;
		int sDamage = 0;
		int hitPoints = 0;
		Warrior warrior = new Warrior(hitPoints, defense, damage, sDamage);
		// TODO Auto-generated method stub
		/**
		 * Main will create a game loop. Inside of the game loop will be how the player
		 * wishes to play the game and attack loops.
		 */
		System.out.println(warrior.getDamage());
		System.out.println(warrior.takeDamage(50));
		System.out.println(warrior.getHitpoints());
	}

}
