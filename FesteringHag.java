
/**
 * A stinky, festering hag
 *
 * @author Craig Hussey
 * @version 11.07.2020
 */
public class FesteringHag extends Demon
{
    private static final int MAX_FESTERINGHAG_HP = 10;
    private static final int MIN_FESTERINGHAG_HP = 2;
    private static final int MAX_FESTERINGHAG_STR = 4;
    private static final int MIN_FESTERINGHAG_STR = 2;
    /**
     * Constructor for objects of class FesteringHag
     */
    public FesteringHag()
    {
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_FESTERINGHAG_STR-MIN_FESTERINGHAG_STR)+MIN_FESTERINGHAG_STR,    
            Randomizer.nextInt(MAX_FESTERINGHAG_HP-MIN_FESTERINGHAG_HP)+MIN_FESTERINGHAG_HP
        );
        setCreatureType("Festering Hag");
    }
    
    /**
     * special ability: 15% chance to deal an extra 10 magic damage
     */
    public int attack() {
        if (Randomizer.nextInt(100)>85) {
            //System.out.println("10 extra magic damage added!");
            return super.attack() + 10;
    }
        else
        return super.attack();
    }
}
