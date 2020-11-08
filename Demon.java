 
/**
 * Write a description of class Demon here.
 *
 * @author Craig Hussey
 * @version 11.7.2020
 */
public abstract class Demon extends Creature
{
    private int str; //strength of this Demon
    private int hp;         // the current numberof hit points the Demon has
    private int max_hp;     // The maximum hit points the Demon can have (used if healing enabled)  
    private static final int MAGICDMG = 50;
    /**
     * Create a Demon with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the Demon started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the Demon at the start of the simulation, and the current health levels during battle
     */
    public Demon (int str, int hp) {
       //clamps strength and hp to a value between 1 and 999
       super(str > 999 ? 999 : str < 1 ? 1 : str, hp = hp > 999 ? 999 : hp < 1 ? 1 : hp);
    }
    
    /**
     * special ability: 5% chance to do magical damage (+50)
     */
    public int attack()
    {
        if (Randomizer.nextInt(100)>95) {
            System.out.println("50 extra magic damage added!");
            return super.attack() + MAGICDMG;
    }
        else
        return super.attack();
    }
    
}
