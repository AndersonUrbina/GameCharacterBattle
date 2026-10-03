public class Mage extends GameCharacter{
    //Constructor
    public Mage(String name, int health, int attackPower){
        super(name, health, attackPower);
    }

    //Attack Method Override
    @Override
    public void attack(GameCharacter target) {
        //Check if this character is alive
        if (isAlive())
            throw new IllegalArgumentException(getName() + " cannot attack because they are defeated.");

        //check if the target character is alive
        if (target.isAlive())
            throw new IllegalArgumentException(getName() + " is already defeated.");
//CHANGE
        System.out.println(getName() + " lets a power attack go to " + target.getName() + "!");
        target.takeDamage(getAttackPower());
    }
}
