import java.util.ArrayList;

public class ReverseArray {
    /**
     * Returns reverse of input array of Strings.
     * <p>
     * @param stringArray: Input array of strings.
     * @return reversedArray: Reversed array of strings.
     */      
    public static ArrayList <String> reverseArray(String[] stringArray) {
        ArrayList<String> reversedArray = new ArrayList<String>();
        for (int i = stringArray.length-1; i > -1; i--) {
            reversedArray.add(stringArray[i]);
        }
        return reversedArray;
    }

    public static void main(String[] args) { 
        String[] stringArray = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        ArrayList<String> reversedArray = reverseArray(stringArray);
        System.out.println(reversedArray);
    }
}
