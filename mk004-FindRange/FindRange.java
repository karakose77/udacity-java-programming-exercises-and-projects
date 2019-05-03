public class FindRange {    
    /**
     * Returns the range of given number of integers, which is the difference
     * between the largest and smallest.
     * <p>
     * 
     * @param inputArray: The input integer array.
     * @return range: The difference between the largest and smallest
     * from inputArray.
     */
    public static int findRange(int[] inputArray) {
        int maxInt = inputArray[0];
        int minInt = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (maxInt < inputArray[i]) {
                maxInt = inputArray[i];
            }
            if (minInt > inputArray[i]) {
                minInt = inputArray[i];
            }
        }
        int range = maxInt - minInt;
        return range;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 0, 2, 3, -1, 2};
        System.out.println(findRange(inputArray));
    }
}
