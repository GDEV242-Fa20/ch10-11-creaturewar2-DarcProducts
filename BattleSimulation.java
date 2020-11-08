import java.util.Stack;
/**
 * The Battle Simulator ~ Creating a BattleSimulation will have a default good army of 100 creatures, and a default evil army with between 30-50 creatures. You are also
 * able to create a battle simulator with custom army sizes. 
 *
 * @author Craig Hussey
 * @version 11.07.2020
 */
public class BattleSimulation
{
    private Stack<Creature> goodArmy;
    private Stack<Creature> evilArmy;
       
    /**
     * constructor for preset battle simulator
     */
    public BattleSimulation () {
        goodArmy = new Stack();
        evilArmy = new Stack();
        int evilArmySize = Randomizer.nextInt(50-30) + 30; //set evil army size to a value between 30-50
        while (goodArmy.size()<100) 
            goodArmy.push(chooseRandomCreatureForgoodArmy()); //choose a creature out of good creatures and add to a stack ~first constructor~
        while (evilArmy.size()<evilArmySize)
            evilArmy.push(chooseRandomCreatureForevilArmy()); //choose a creature out of evil creatures and add to a stack ~first constructor~
        startBattle();
    }
    
    /**
     * sets up a new battle simulation with custom size armies
     * @param goodArmySize the size of the army of light
     * @param evilArmySize the size of the army of darkness
     */
    public BattleSimulation (int goodArmySize, int evilArmySize) {
        goodArmy = new Stack();
        evilArmy = new Stack();
        goodArmySize = goodArmySize >  10000000 ?  10000000 : goodArmySize < 1 ? 1 : goodArmySize; //clamps goodArmy size between a value of 1 and  10000000
        evilArmySize = evilArmySize >  10000000 ?  10000000 : evilArmySize < 1 ? 1 : evilArmySize; //clamps evilArmy size between a value of 1 and  10000000
        while (goodArmy.size()<goodArmySize) 
            goodArmy.push(chooseRandomCreatureForgoodArmy()); //choose a creature out of good creatures and add to a stack ~second constructor~
        while (evilArmy.size()<evilArmySize) 
            evilArmy.push(chooseRandomCreatureForevilArmy()); //choose a creature out of evil creatures and add to a stack ~second constructor~
        startBattle();
    }
    
    /**
     * main method to start without blueJ
     */
    public static void main(String[] args) 
    {
        BattleSimulation thisBattle = new BattleSimulation();
    }
    
    /**
     * the main battle loop
     */
    private void startBattle() 
    {
    while (!goodArmy.isEmpty() && !evilArmy.isEmpty()) 
    {
        Creature goodArmyCreature = goodArmy.peek(); //look at top object in good army stack
        Creature evilArmyCreature = evilArmy.peek(); //look at top object in evil army stack
        goodArmyCreature.takeDamage(evilArmyCreature.attack()); //apply damage to top creature in stack
        evilArmyCreature.takeDamage(goodArmyCreature.attack()); //apply damage to top creature in stack
        if (goodArmyCreature.isKnockedOut()) //if good creature is dead, remove from top of stack of good army
            goodArmy.pop();
        if (evilArmyCreature.isKnockedOut()) //if evil creature is dead, remove from top of stack of evil army
            evilArmy.pop();
    }  
        System.out.println();
    if (!goodArmy.isEmpty()) //prints out message if good army wins
        System.out.println("The good army was victorious with " + goodArmy.size() + " remaining heroes!");
    if (!evilArmy.isEmpty()) //prints out message if evil army wins
        System.out.println("The evil army was victorious with " + evilArmy.size() + " remaining foes!");
    }
    
    /**
     * returns a new creature for good army
     * @return
     */
    public Creature chooseRandomCreatureForgoodArmy() 
    {
        int randNum = Randomizer.nextInt(10);
        if (randNum < 7) 
            return new Human();
        else if (randNum > 6 && randNum < 8) 
            return new Halfling();
        else 
            return new Elf();
    }
    
    /**
     * returns a new creature for evil army
     * @return
     */
    public Creature chooseRandomCreatureForevilArmy() 
    {
        int randNum = Randomizer.nextInt(25);
        
        if (randNum < 19) 
            return new FesteringHag();
        else if (randNum > 18 && randNum < 25) 
            return new CyberDemon();
        else 
            return new Balrog();
    }
}
