
/**
 * A stinky, festering hag
 *
 * @author Craig Hussey
 * @version 11.07.2020
 */
public class FesteringHag extends Demon
{
    private static final int MAX_FESTERINGHAG_HP = 18;
    private static final int MIN_FESTERINGHAG_HP = 8;
    private static final int MAX_FESTERINGHAG_STR = 8;
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
    }
    
}
