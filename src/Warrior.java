public class Warrior extends GameCharacter {
    //Constructor
    public Warrior(String name, int health, int attackPower){
        super(name, health, attackPower);
    }

    //Attack Override
    @Override
    public void attack(GameCharacter target) {
        //Check if this character is alive
        if (isAlive())
            throw new IllegalArgumentException(getName() + " cannot attack because they are defeated.");

        //check if the target character is alive
        if (target.isAlive())
            throw new IllegalArgumentException(target.getName() + " is already defeated. ");

        System.out.println(getName() + " swings a sword at " + target.getName() + "!");
        target.takeDamage(getAttackPower());
    }
}
