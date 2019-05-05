import java.util.ArrayList;

public class MonopolyRoll {    
    /**
     * The function:   
     * 1. Generates two random numbers in the 1 to 6 range.    
     * 2. If they are not the same, returns the sum of all numbers
     * rolled so far.    
     * 3. If they are the same, keeps track of the total rolled
     * so far and return to step 1.
     * 4. If the three consecutive rolls are doubles, returns -1
     * instead of continuing to roll. 
     * <p>   
     * @param diceList: Input array list for recursive calculations.
     * @return sum: Sum of the valid monopoly rolls.
     */
    public static int monopolyRoll(ArrayList<Integer> diceList) {
        if (diceList.size() >= 6) {
            return -1;
        }
        for (int i = 0; i < 2; i++) {
            diceList.add((int) (Math.random() * 6 + 1));
        }      
        if (diceList.get(diceList.size() - 2) != diceList.get(diceList.size() - 1)) {
            int sum = 0;
            for (int i = 0, l = diceList.size(); i < l; i++) {
                sum += diceList.get(i);
            }
            return sum;
        } else {
            return monopolyRoll(diceList);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> inputArray = new ArrayList<Integer>();
        int result = monopolyRoll(inputArray);
        System.out.println("The sum of rolled dices is: \n" + result);
        System.out.println("Rolled dices are:");
        for (int i = 0; i < inputArray.size(); i++) {
            System.out.println(inputArray.get(i));
        }
    }
}
