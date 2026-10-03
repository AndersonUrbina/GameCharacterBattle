public class EpicBattle {
    public static void main(String[] args){
        System.out.println("Welcome, the epic battle is about to start.");

        //Do valid actions in a try catch block
        try {
            //Create characters
            Archer archer = new Archer("Legolas",70,15);
            Mage mage = new Mage("Gandalf", 80, 25);
            Warrior warrior = new Warrior("Ryan",90,20);

            System.out.println("Starting Characters:");
            printDivider();

            System.out.println("The Archer: ");
            archer.displayInfo();
            printDivider();

            System.out.println("The Mage:");
            mage.displayInfo();
            printDivider();

            IO.println("The Warrior: ");
            warrior.displayInfo();
            printDivider();

            //Round 1
            System.out.println("Let the battle begin!");
            archer.attack(mage);
            System.out.println();

            warrior.attack(archer);
            System.out.println();

            mage.attack(archer);
            System.out.println();

            archer.attack(warrior);
            IO.println();

            //Update after Round 1:
            System.out.println("Updated Character Information:");
            printDivider();

            System.out.println("The Warrior: ");
            warrior.displayInfo();
            printDivider();

            System.out.println("The Archer: ");
            archer.displayInfo();
            printDivider();

            System.out.println("The Mage: ");
            mage.displayInfo();
            printDivider();

        } catch (IllegalStateException e){
            System.out.println("Invalid action error: " + e.getMessage());
        }

        // Test Invalid Actions
        System.out.println("Testing invalid character creation:");

        try{
            Warrior noName = new Warrior("", 100, 20);
            noName.displayInfo();
        }catch (IllegalArgumentException e){
            System.out.println("Invalid data error: " + e.getMessage());
        }

        try {
            Mage badMage = new Mage("Sarumon", 0, 30);
            badMage.displayInfo();
        } catch (IllegalArgumentException e){
            IO.println("Invalid data error: " + e.getMessage());
        }
    }

    public static void printDivider(){
        System.out.println("----------------------------------");
    }
}
