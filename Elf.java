
/**
 * Slim and fit ELf
 *
 * @author Craig Hussey
 * @version 11.07.2020
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
       super(    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP
        ); 
        setCreatureType("Elf");
    }
    
    /**
     * special ability: 10% chance to do magical damage (2x damage returned)
     */
    public int attack()
    {
        if (Randomizer.nextInt(100)>90) {
        return super.attack() * 2;
        }
        else
        return super.attack();
    }
}
