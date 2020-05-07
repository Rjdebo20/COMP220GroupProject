import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// personal
		Scanner scan = new Scanner(System.in);
		// random num generator
		String name;
		String answer;
		//
		int defense = 2;
		int damage = 5;
		int sDamage = 0;
		int hitPoints = 100;
		Warrior warrior = new Warrior(hitPoints, defense, damage, sDamage);
		int defense1 = 0;
		int damage1 = 2;
		int sDamage1 = 0;
		int hitPoints1 = 10;
		Demon demon = new Demon(hitPoints1, defense1, damage1, sDamage1);

		boolean gameOn = true;
		boolean on = true;
		while (gameOn == true) {

			System.out.println("Wizard: Mysterious warrior, what do thou mother calleth?");
			name = scan.next();
			System.out.println("Wizard: Hmph..." + name + ", sounds like the name of a great warrior.");
			System.out.println("Wizard: " + name
					+ " would you like to help me slay an evil demon that has been attacking the local villagers? (y/n)");
			answer = scan.next();
			if (answer.equals("n") || answer.equals("N")) {
				System.out.println("Wizard: Oh...Sorry to have asked. Continue on with your day warrior.");
				gameOn = false;
			} else if (answer.equals("y") || answer.equals("Y")) {
				System.out.println("Wizard: Thank you great warrior, let us begin the fight!");
				System.out.println("Wizard: Here is your inventory.");
				System.out.println(warrior.inventory());
				while (on == true) {
					String battleDecision;
					System.out.println("Wizard: The demon currently has: " + demon.getHitpoints());
					System.out.println("Wizard: You currently have: " + warrior.getHitpoints() + " and "
							+ warrior.getArmor() + " armor");
					System.out.println("Wizard: Would you like to attack, or use an item? a/i");
					battleDecision = scan.next();

					if (battleDecision.equals("a") || battleDecision.equals("A")) {
						System.out.println("Wizard: Wise move, attack");
						if (!demon.block()) {
							demon.setHitpoints(demon.getHitpoints() - warrior.getDamage());
							System.out.println("Wizard: " + name + ", it's attacking back!");
						} else {
							System.out.println("The attack was blocked!");
							System.out.println("Wizard: It is attacking back!");
						}
						if (!warrior.block()) {
							if (warrior.getArmor() == 0 && demon.getHitpoints() > 0) {
								warrior.setHitpoints(warrior.getHitpoints() - demon.getDamage());
							} else if (warrior.getArmor() > 0 && demon.getHitpoints() > 0) {
								warrior.setArmor(warrior.getArmor() - demon.getDamage());
							}
						} else {
							System.out.println("Wizard: You blocked his attack!");
						}
					} else if (battleDecision.equals("i") || battleDecision.equals("I")) {
						System.out.println("Wizard: Good decision!");
						warrior.useItem(warrior.getItem());
						System.out.println("This is now your inventory " + "\n" + warrior.inventory());
					}

					if (demon.getHitpoints() <= 0) {
						String cont;
						System.out.println(
								"Wizard: You've done it! You saved the village great warrior, " + name + "! Huzahhh!!");
						System.out.println(
								"Wizard: It looks as though the demon dropped a health potion and a defense potion! Would you like to put the health potion into your inventory?(y/n)");
						String hyOrn = scan.next();
						HealthPotion hp = new HealthPotion();
						DefensePotion dp = new DefensePotion();
						if (hyOrn.equals("y") || hyOrn.equals("Y")) {
							warrior.addItem(hp);
							if (warrior.inventory.size() < 9) {
								System.out.println("Wizard: Excellent!");
							}
						} else if (hyOrn.equals("n") || hyOrn.equals("N")) {
							System.out.println("Wizard: Fair enough!");
						}
						System.out.println("Wizard: What about the defense potion?");
						String dyOrn = scan.next();
						if (dyOrn.equals("y") || dyOrn.equals("Y")) {
							warrior.addItem(dp);
							if (warrior.inventory.size() < 9) {
								System.out.println("Wizard: Stupendous!");
							}
						} else if (dyOrn.equals("n") || dyOrn.equals("N")) {
							System.out.println("Wizard: Not a problem!");
						}

						System.out.println("Wizard: Would you like to check your inventory? (y/n)");
						String inv = scan.next();
						if (inv.equals("y") || inv.equals("Y")) {
							System.out.println(warrior.inventory());
						} else if (inv.equals("n") || inv.equals("N")) {
							System.out.println("Wizard: Ah, yes, okay!");
						}
						System.out.println("Wizard: Would you like to help us fight another demon? (y/n)");
						cont = scan.next();
						if (cont.equals("y") || cont.equals("Y")) {
							System.out.println("Wizard: Oh...that's great lets go find another.");
							demon.setHitpoints(10);
						} else if (cont.equals("n") || cont.contentEquals("N")) {
							System.out.println(
									"Wizard: That's okay we thank you for the amount of bravery you've shown towards our village");
							on = false;
							gameOn = false;
						}
					} else if (warrior.getHitpoints() <= 0) {
						System.out.println("Wizard: You have died:(");
						String revive;
						for (int i = 0; i < warrior.inventory.size(); i++) {
							if (warrior.inventory.get(i).getName().equals("Resurrection Stone")) {
								System.out.println(
										"Wizard: WAIT! You have a resurrection stone! Would you like to use it?");
								revive = scan.next();
								if (revive.equals("y") || revive.equals("Y")) {
									System.out.println("Thank goodness!");
									warrior.useItem(warrior.inventory.get(i));
									on = true;
									break;
								} else if (revive.equals("n") || revive.equals("N")) {
									System.out.println("Wizard: Be at peace, great warrior.");
									on = false;
									gameOn = false;
								}
							} else {
								System.out.println("Wizard: Oh no... we've lost... goodbye great warrior...");
								on = false;
								gameOn = false;
								break;
							}
						}

					}
				}
			} else {
				System.out.println("Wizard: Well that didn't answer my question...let's try that again");

			}

		}
	}

}
