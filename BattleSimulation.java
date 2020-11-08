import java.util.ArrayList;
/**
 * Write a description of class BattleSimulation here.
 *
 * @author Craig Hussey
 * @version 11.07.2020
 */
public class BattleSimulation
{
    private ArrayList<Creature> armyOne;
    private ArrayList<Creature> armyTwo;
        
    public BattleSimulation () {
        armyOne = new ArrayList();
        armyTwo = new ArrayList();
        int numberArmyOne = 1;
        while (armyOne.size()<100) {
            Creature myCreature = chooseRandomCreatureForArmyOne();
            armyOne.add(myCreature);
            System.out.println(numberArmyOne + ":" + " Added " + myCreature);
            numberArmyOne++;
        }
        int numberArmyTwo = 1;
        while (armyTwo.size()<Randomizer.nextInt(50-30)+30) {
            Creature myCreature = chooseRandomCreatureForArmyTwo();
            armyTwo.add(myCreature);
            System.out.println(numberArmyTwo + ":" + " Added " + myCreature);
            numberArmyTwo++;
        }
    }
    
    public BattleSimulation (int armyOneSize, int armyTwoSize) {
        armyOne = new ArrayList();
        armyTwo = new ArrayList();
        armyOneSize = armyOneSize > 999999 ? 999999 : armyOneSize < 1 ? 1 : armyOneSize;
        armyTwoSize = armyTwoSize > 999999 ? 999999 : armyTwoSize < 1 ? 1 : armyTwoSize;
        while (armyOne.size()<armyOneSize) {
            Creature myCreature = chooseRandomCreatureForArmyOne();
            armyOne.add(myCreature);
            System.out.println("Added " + myCreature);
        }
        while (armyTwo.size()<armyTwoSize) {
            Creature myCreature = chooseRandomCreatureForArmyTwo();
            armyTwo.add(myCreature);
            System.out.println("Added " + myCreature);
        }
    }
    
    public static void main(String[] args) {
        BattleSimulation thisBattle = new BattleSimulation();
    }
    
    private void startBattle(ArrayList armyOne, ArrayList armyTwo) {
    }
    
    public Creature chooseRandomCreatureForArmyOne() {
        int randNum = Randomizer.nextInt(10);
        if (randNum < 7) 
        return new Human();
        else if (randNum > 6 && randNum < 8) 
        return new Halfling();
        else 
        return new Elf();
    }
    
    public Creature chooseRandomCreatureForArmyTwo() {
        int randNum = Randomizer.nextInt(25);
        if (randNum < 19) 
        return new FesteringHag();
        else if (randNum > 18 && randNum < 25) 
        return new CyberDemon();
        else 
        return new Balrog();
    }
}
