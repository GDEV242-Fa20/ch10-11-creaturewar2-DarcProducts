
/**
 * Write a description of class Halfling here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Halfling extends Creature
{
    private static final int MAX_HALFLING_HP = 20;
    private static final int MIN_HALFLING_HP = 8;
    private static final int MAX_HALFLING_STR = 10;
    private static final int MIN_HALFLING_STR = 4;
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
    }
}
