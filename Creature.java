
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Crosbie
 * @version 2020-10 v1.0
 */
// we will learn what the abstract keyword does in a later chapter
public abstract class Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // the current numberof hit points the creature has
    private String creatureType; //stores the type of creature for data use
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Creature ()
    {
        str=10;
        hp=10;
        max_hp = hp;
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage {MAX 999}
     * @param hp the health of the creature at the start of the simulation, {MAX 9999}
     * and the current health levels during battle
     */
    public Creature (int str, int hp) 
    {
       this.str = str > 999 ? 999 : str < 1 ? 1 : str; //clamps strength to value between 1 and 999
       this.hp = hp > 9999 ? 9999 : hp < 1 ? 1 : hp; //clamps health to value between 1 and 9999
       max_hp = this.hp; //sets max_hp to this.hp
    }
    
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack()
    {
        int attackDMG = Randomizer.nextInt(this.str - 1) + 1;
        //System.out.println(creatureType + " dealt " + attackDMG + " damage!");
        return attackDMG;
    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() 
    {
        return hp>0;
    }
    
    /**
     * Is this creature knockedOut?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isKnockedOut() 
    {
        //System.out.println(creatureType + " is knocked out!");
        return hp<1;
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        hp -= damage;
    }
    
    /**
     * gets the current health
     * @return
     */
   public int getHealth() {
       return hp;
    }
        
    /**
     * gets the current creature type
     * @return
     */
   public String getCreatureType() {
       return creatureType;
    }
    
    /**
     * sets the current creature type as a string
     * @param sets string value for name of creature
     */
   public void setCreatureType(String name) {
       creatureType = name;
    }
}
