import java.util.Scanner;
public class Choose {
	public static void main(String [] args) {
			System.out.println ("you see a scary house. Y. Do you investigate? Y or N");
			Scanner inputChoice = new Scanner(System.in); 
			String choice = inputChoice.nextLine();
			String upchoice = choice.toUpperCase();
			if (upchoice.equals("Y")) { 
			System.out.println ("You are very brave. You sneak in the side door.");
			} else { 
				System.out.println("Chicken. See ya.");	
					return;
			}
			
			System.out.println("The side door creaks! Zombies awake. Continue Y or leave N?");
			// Scanner inputchoice = new Scanner(system.in);
			choice = inputChoice.nextLine();
			upchoice = choice.toUpperCase();
			
			if (upchoice.equals("Y")) { 
				System.out.println("You find a cricket bat and destroy the first zombie! Run upstairs.");
			} else { 
				System.out.println("Zombie eats your brain. You die scum!");
				return;
			}
			
			System.out.println("Zombies start running up the stairs! Do you grab the Tactical Shotgun? Y for yes. N for no ");
			choice = inputChoice.nextLine();
			upchoice = choice.toUpperCase();
			
			if (upchoice.equals("Y")) { 
				System.out.println("You pick up the shotgun and start firing but the shotgun doesn't work and the zombies pick you up and break your neck");
			} else { 
				System.out.println("You made the smart desicion and left. You jump out the window and run away back to your home"); 
			
			}		
		}
	}	
				
							