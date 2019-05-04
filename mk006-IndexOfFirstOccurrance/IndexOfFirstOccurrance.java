public class IndexOfFirstOccurrance {   
    /**
     * Returns the first occurance of input 
     * target String in input stringArray array
     * of Strings.
     * <p>
     * @param stringArray: Input array of Strings.
     * @param target:      Input target String.
     * @return i: First occurance of target String.
     */
    public static int indexOfFirstOccurrence(String[] stringArray, String target) {
        for (int i = 0; i < stringArray.length; i++) {
            if (target == stringArray[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) { 
        String[] sentence = { "Learning", "Java", "is", "fun" };
        int indexOfWordJava = indexOfFirstOccurrence(sentence, "fun");
        System.out.println(indexOfWordJava);
    }
}
