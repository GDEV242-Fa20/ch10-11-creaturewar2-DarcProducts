
/**
 * Write a description of class CyberDemon here.
 *
 * @author Craig Hussey
 * @version 11.07.2020
 */
public class CyberDemon extends Demon
{
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;
    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR,    
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP
        ); 
    }

}
