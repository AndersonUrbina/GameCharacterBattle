public class GameCharacter {
    //Class variables
    private final String name;
    private int health;
    private final int attackPower;

    public GameCharacter(String name, int health, int attackPower){
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Character name cannot be blank.");

        if (health <= 0)
            throw new IllegalArgumentException("Starting Health must be greater than zero.");

        if (attackPower <= 0)
            throw new IllegalArgumentException("Attack power must be greater than zero.");

        //Finally, set the class variables
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    //Accessor Methods
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getAttackPower() {
        return attackPower;
    }

    public boolean isAlive(){
        return health <= 0;
    }

    //Void to attack
    public void attack (GameCharacter target){
        //Check if this character is alive
        if (isAlive())
            throw new IllegalArgumentException(name + " cannot attack because they are defeated");

        //Check if the target character is alive
        if (target.isAlive())
            throw new IllegalArgumentException(target.getName() + " is already defeated.");

        //Apply the damage
        System.out.println(name+" attacks " + target.getName() + "!");
        target.takeDamage(attackPower);
    }


    //Void to take damage
    public void takeDamage(int damageAmount){
        //Validate the damage
        if (damageAmount < 0){
            throw new IllegalArgumentException("Damage Amount Cannot be Negative.");
        }

        //Apply the damage
        health -= damageAmount;

        //Control for negatives
        if (health < 0)
            health = 0;

        //Report the result
        System.out.println(name+" take " + damageAmount + " damage.");
        System.out.println(name+ "'s health is "+ health + "!");

    }

    //Void to display character Info
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power:" + attackPower);
    }

}
