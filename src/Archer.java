public class Archer extends GameCharacter {
    //Constructor
    public Archer(String name, int health, int attackPower){
        super(name, health, attackPower);
    }

    //Override the attack method
    @Override
    public void attack(GameCharacter target){
        if (isAlive())
            throw  new IllegalArgumentException(getName() + " cannot attack because they defeated.");

        if (target.isAlive())
            throw new IllegalArgumentException(getName() + " is already defeated.");

        System.out.println(getName() + " lets an arrow fly at " + target.getName() + "!");
        target.takeDamage(getAttackPower());
    }
}
