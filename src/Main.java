import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//personal
		Scanner scan = new Scanner(System.in);
		//random num generator
		String name;
		String answer;
		//
		int defense = 2;
		int damage = 5;
		int sDamage = 0;
		int hitPoints = 10;
		Warrior warrior = new Warrior(hitPoints, defense, damage, sDamage);
		int defense1 = 0;
		int damage1 = 2;
		int sDamage1 = 0;
		int hitPoints1 = 10;
		Demon demon = new Demon(hitPoints1, defense1, damage1, sDamage1);
		
		boolean gameOn = true;
		boolean on = true;
		while(gameOn == true) {
			
			System.out.println("Wizard: Mysterious warior, what do thou mother call eth?");
			name = scan.nextLine();
			System.out.println("Wizard: Hmph..." + name + ", sounds like the name of a great warrior.");
			System.out.println("Wizard: " + name + " would you like to help me slay an evil demon that has been attacking the local villagers (y/n");
			answer = scan.next();
			if(answer.equals("n") || answer.equals("N")) {
				System.out.println("Wizard: Oh...Sorry to have asked continue on with your day warrior.");
				gameOn = false;
			}
			else if(answer.equals("y") || answer.equals("Y")){
				System.out.println("Wizard: Thank you great warrior let us begin the fight!");
				while(on == true){
					String battleDecision;
					System.out.println("Wizard: The demon currently has: " + demon.getHitPoints());
					System.out.println("Wizard: You currently have: " + warrior.getHitpoints() + " and " + warrior.getArmor() + " armor");
					System.out.println("Wizard: Would you like to block? b/a");
					battleDecision = scan.next();
					
					if(battleDecision.equals("a") || battleDecision.equals("A")) {
						System.out.println("Wizard: Wise move, attack");
						demon.setHitpoints(demon.getHitPoints()-warrior.getDamage());
						System.out.println("Wizard: "+name + " it's attacking back");
						if(warrior.getArmor() <= 0) {
							warrior.setHitpoints(warrior.getHitpoints()-demon.getDamge());
						}else {
							warrior.setArmor(warrior.getArmor()-demon.getDamge());
						}
					}else if(battleDecision.equals("b") || battleDecision.equals("B")) {
						System.out.println("Wizard: Wise the best defense is the best offense");
					}
					
					
					if(demon.getHitPoints() <= 0){
						String cont;
						System.out.println("Wizard: You've done! You saved the village great warrior " + name + "! Huzahhh!!");
						System.out.println("Wizard: Would you like to help us fight another demon? (y/n)");
						cont = scan.next();
						if(cont.equals("y") || cont.equals("Y")) {
							System.out.println("Wizard: Oh...that's great lets go find another.");
							demon.setHitpoints(10);
						}
						else{
							System.out.println("Wizard: That's okay we thank you for the amount of bravery you've shown towards our village");
							on = false;
							gameOn = false;
						}
					}else if (warrior.getHitpoints() <= 0) {
						System.out.println("Wizard: Oh no... we've lost... good bye great warrior...");
						on = false;
					}
				}
			}
			else {
				System.out.println("Wizard: Well that didn't answer my question...let's try that again");
			}
			
		}
	}
	
}
