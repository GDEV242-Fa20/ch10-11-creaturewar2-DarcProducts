import java.util.Stack;
/**
 * Write a description of class BattleSimulation here.
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
        int evilArmySize = Randomizer.nextInt(50-30) + 30;
        while (goodArmy.size()<100) {
            goodArmy.push(chooseRandomCreatureForgoodArmy());
        }
        while (evilArmy.size()<evilArmySize) {
            evilArmy.push(chooseRandomCreatureForevilArmy());
        }       
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
        goodArmySize = goodArmySize > 999999999 ? 99999999 : goodArmySize < 1 ? 1 : goodArmySize; //clamps goodArmy size between a value of 1 and 999999999
        evilArmySize = evilArmySize > 999999999 ? 99999999 : evilArmySize < 1 ? 1 : evilArmySize; //clamps evilArmy size between a value of 1 and 999999999
        while (goodArmy.size()<goodArmySize) {
            goodArmy.push(chooseRandomCreatureForgoodArmy());
        }
        while (evilArmy.size()<evilArmySize) {
            evilArmy.push(chooseRandomCreatureForevilArmy());
        }
        startBattle();
    }
    
    /**
     * main method to start without blueJ
     */
    public static void main(String[] args) {
        BattleSimulation thisBattle = new BattleSimulation();
    }
    
    /**
     * the main battle loop
     */
    private void startBattle() {
     while (!goodArmy.isEmpty() && !evilArmy.isEmpty()) {
         Creature goodArmyCreature = goodArmy.peek();
         Creature evilArmyCreature = evilArmy.peek();
             goodArmy.peek().takeDamage(evilArmyCreature.attack());
             evilArmyCreature.takeDamage(goodArmyCreature.attack());
         if (goodArmyCreature.isKnockedOut()) {
             goodArmy.pop();
         }
         if (evilArmyCreature.isKnockedOut()) {
             evilArmy.pop();
         }
    }  
    System.out.println();
    if (!goodArmy.isEmpty())
    System.out.println("The good army was victorious with " + goodArmy.size() + " remaining heroes!");
    if (!evilArmy.isEmpty())
    System.out.println("The evil army was victorious with " + evilArmy.size() + " remaining foes!");
    }
    
    /**
     * returns a new creature from Army One;
     * @return
     */
    public Creature chooseRandomCreatureForgoodArmy() {
        int randNum = Randomizer.nextInt(10);
        if (randNum < 7) 
        return new Human();
        else if (randNum > 6 && randNum < 8) 
        return new Halfling();
        else 
        return new Elf();
    }
    
    /**
     * returns a new creature from Army Two;
     * @return
     */
    public Creature chooseRandomCreatureForevilArmy() {
        int randNum = Randomizer.nextInt(25);
        if (randNum < 19) 
        return new FesteringHag();
        else if (randNum > 18 && randNum < 25) 
        return new CyberDemon();
        else 
        return new Balrog();
    }
}
