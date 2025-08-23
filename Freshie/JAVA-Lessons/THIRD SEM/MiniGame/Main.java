import java.util.Scanner;

class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		
		System.out.print("Enter character name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter class type (Warrior/Mage/Archer): ");
		String classType = scan.nextLine();
		
		if(classType.equalsIgnoreCase("Warrior") || classType.equalsIgnoreCase("Mage") || classType.equalsIgnoreCase("Archer"){
			System.our.println("Invalid! Please Try Again");
		} else {

			System.out.print("Enter initial level: ");
			int level = scan.nextInt();
			scan.nextLine();
			
			Character character = new Character(name, classType, level);
			System.out.println("\nCharacter Created!");
			character.displayInfo();

			System.out.print("\nDo you want to level up? (yes/no)");
			String levelUpChooser = scan.nextLine();
				
			if(levelUpChooser.equalsIgnoreCase("Yes")){
				character.levelUp();
				System.out.println("Congratulations! " + character.getName() + " has leveled up to " + character.getLevel());
				System.out.println("\nUpdated Character Information: ");
				character.displayInfo();
			} else if(levelUpChooser.equalsIgnoreCase("No") {
				System.out.println("\nYour level remains the same");
				System.out.println("Character Information: ");
				character.displayInfo();
			}
		}
			
	}
}

class Character{
	private String name, classType;
	private int level;
	
	public Character(String name, String classType, int level){
		this.name = name;
		this.classType = type;
		this.level = level;	
	}
	
	public String getName(){ return name; }
	public String getClassType() { return classType; }
	public int getLevel() { return level; }
	public int levelUp(){ this.level += 1; }
	
	public void displayInfo() {
		System.out.println("Name: " + name +
		"\nClass Type: " + classType +
		"\nLevel: " + level);
	}
}
