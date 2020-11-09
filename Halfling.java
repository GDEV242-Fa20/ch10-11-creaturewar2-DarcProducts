
/**
 * Short folk with big hairy feet
 *
 * @author Craig Hussey
 * @version 11.08.2020
 */
public class Halfling extends Creature
{
    private static final int MAX_HALFLING_HP = 20;
    private static final int MIN_HALFLING_HP = 8;
    private static final int MAX_HALFLING_STR = 20;
    private static final int MIN_HALFLING_STR =8;
    /**
     * Constructor for objects of class Elf
     */
    public Halfling()
    {
        // initialise instance variables
       super(    
            Randomizer.nextInt(MAX_HALFLING_STR-MIN_HALFLING_STR)+MIN_HALFLING_STR,
            Randomizer.nextInt(MAX_HALFLING_HP-MIN_HALFLING_HP)+MIN_HALFLING_HP
        ); 
        setCreatureType("Halfling");
    }
}
