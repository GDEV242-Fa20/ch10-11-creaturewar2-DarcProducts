
/**
 * Write a description of class Balrog here.
 *
 * @author Craig Hussey
 * @version 11.07.2020
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // initialise instance variables
        super(    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP
        ); 
    }
    
    /**
     * special ability: attack TWICE each round
     */   
    public int attack() {
        int attackOne = super.attack(); 
        System.out.println(this + " hit for " + attackOne);
        int attackTwo = super.attack();
        System.out.println(this + " hit for " + attackTwo);
        return attackOne + attackTwo;
    }
    
}
