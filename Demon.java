 
/**
 * Chance for extreme magical damage for all demons
 *
 * @author Craig Hussey
 * @version 11.7.2020
 */
public abstract class Demon extends Creature
{
    private static final int MAGICDMG = 50;
    /**
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
            //System.out.println("50 extra magic damage added!");
            return super.attack() + MAGICDMG;
    }
        else
        return super.attack();
    }
    
}
